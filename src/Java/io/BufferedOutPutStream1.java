package Java.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class BufferedOutPutStream1 implements AutoCloseable{
	/** 輸出檔案之副檔名 */
	public static final String EXT_NAME = ".ars2";
	
	private OutputStream output;
	private boolean closed;
	
	private static final int BYTE_BUFFER_SIZE = 4096; //bytes
    private static final int CHAR_BUFFER_SIZE = 1024; //chars
    private static boolean _useNIO = false;
	
	synchronized public BufferedOutPutStream1 append(final File inputFile) {
		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(inputFile))) {
			return append1(inputFile.getName(), in, inputFile.length());
		} catch(IOException ie) {
			throw new RuntimeException(ie.getMessage(), ie);
		}
	}
	synchronized public BufferedOutPutStream1 append1(final String filename, final InputStream input, final long fileLength) {
		try {
			//寫檔名
			final OutputStream out = getOutput();
			final byte[] filenameBytes = filename.getBytes("UTF-8");
			out.write(alignRight(Integer.toHexString(filenameBytes.length), 4, '0').getBytes()); //檔名長度(byte 數)
			out.write(filenameBytes); //檔名
			
			//寫檔案內容
			out.write(alignRight(Long.toHexString(fileLength), 8, '0').getBytes()); //檔案內容長度(byte 數)
			dump(input, out);
			return this;
		} catch(IOException ie) {
			throw new RuntimeException(ie.getMessage(), ie);
		}
	}
	
	
	@Override
	synchronized public void close() {
		if(this.output != null) {
			try {
				this.output.flush();
				this.output.close();
				this.output = null;
				this.closed = true;
			} catch(IOException ie) {
				throw new RuntimeException(ie.getMessage(), ie);
			}
		}
	}
	
	synchronized private OutputStream getOutput() {
		if(this.closed)
			throw new IllegalStateException("output stream already closed");
		return this.output;
	}
	
	public static String alignRight(String s, int len, char ch) {
    	return alignRight(s, len, ch, true);
    }
	
	static String alignRight(String s, int len, char ch, boolean cut) {
    	if(s == null)
    		return null;
    	if(len <= 0)
    		return "";
        int l = s.length();
        if(l > len) {
        	if(cut)
        		return s.substring(l - len);
        	return s;
        }
        if(l == len)
            return s;
        return new StringBuilder().append(repeat(ch, len - l)).append(s).toString();
    }
	
	public static String repeat(char ch, int n) {
    	if(n < 1)
    		return "";
        char[] ar = new char[n];
        Arrays.fill(ar, ch);
        return new String(ar);
    }
	
	public static long dump(final InputStream data, final OutputStream ... dest) {
    	try {
    		if(data == null)
    			return 0L;
    		if(dest == null || dest.length == 0)
    			throw new IllegalArgumentException("destination argument (OutputStream) not specified");
    		
    		if(dest.length == 1)
    			return dump1(data, dest[0]);
    		
    		byte[] buff = new byte[BYTE_BUFFER_SIZE];
    		long ret = 0;
    		for(int n; (n = data.read(buff)) != -1; ) {
    			for(int i = 0; i < dest.length; i++) {
    				if(dest[i] == null)
    					throw new IllegalArgumentException((i + 1) + "th OutputStream argument is null");
    				
    				dest[i].write(buff, 0, n);
    			}
    			ret += n;
    		}
    		return ret;
    	} catch(Throwable t) {
    		t.printStackTrace();
    	}
		return 0;
    }
	
	static long dump1(final InputStream data, final OutputStream dest) throws IOException {
    	if(dest == null)
    		throw new IllegalArgumentException("OutputStream argument not specified");
    	
    	final byte[] buff = new byte[BYTE_BUFFER_SIZE];
		long ret = 0;
		for(int n; (n = data.read(buff)) != -1; ) {
			dest.write(buff, 0, n);
			ret += n;
			
			//if(Thread.interrupted()) //防止 thread 中斷時陷入無限等待 (NOTE: Guava common.io.ByteStream.copy(InputStream, OutputStream) 也沒有這樣的措施...
			//	throw new InterruptedException("stream copying stopped because of thread interruption");
		}
		return ret;
    }

	public static void main(String[] args) {
		BufferedOutPutStream1 bf = new BufferedOutPutStream1();
		String[] paths = {"src/LIN/new.txt","src/LIN/new2.txt","src/LIN/NewFile2.txt"};
		for(int i=0;i<paths.length;i++) {
		File path = new File(paths[i]);
		//System.out.println(path.exists());
		bf.append(path);
		}
	}

}
