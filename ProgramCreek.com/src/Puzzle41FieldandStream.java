import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Puzzle41FieldandStream {
	/*
	This method copies one file to another and was designed to close every stream it
	creates, even if it encounters I/O errors.*/
	
	static void copy(String src, String dest) throws IOException {
		InputStream in = null;
		OutputStream out = null;
		try {
		in = new FileInputStream(src);
		out = new FileOutputStream(dest);
		byte[] buf = new byte[1024];
		int n;
		while ((n = in.read(buf)) >= 0)
		out.write(buf, 0, n);
		} finally {
		if (in != null) in.close();
		if (out != null) out.close();
		}
		}/*
	The calls to close
	can cause the finally block to complete abruptly. Unfortunately, the compiler
	doesn’t help you find the problem, because close throws the same exception type
	as read and write, and the enclosing method (copy) is declared to propagate it.*/
	
	finally {
		if (in != null) {
		try {
		in.close();
		} catch (IOException ex) {
		// There is nothing we can do if close fails
		}
		}
		if (out != null) {
		try {
		out.close();
		} catch (IOException ex) {
		// Again, there is nothing we can do if close fails
		}
		}
		}
	
	finally {
		closeIgnoringException(in);
		closeIgnoringException(out);
		}
	
	private static void closeIgnoringException(Closeable c) {
		if (c != null) {
		try {
		c.close();
		} catch (IOException ex) {
		// There is nothing we can do if close fails
		}
		}
		}/*
	In summary, when you call the close method in a finally block, protect it
	with a nested try-catch to prevent propagation of the IOException. More generally,
	handle any checked exception that can be thrown within a finally block
	rather than letting it propagate.*/
	
}
