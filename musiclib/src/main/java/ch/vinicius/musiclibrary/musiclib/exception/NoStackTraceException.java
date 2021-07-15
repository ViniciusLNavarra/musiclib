package ch.vinicius.musiclibrary.musiclib.exception;

@SuppressWarnings("serial")
public class NoStackTraceException extends RuntimeException {
	public NoStackTraceException() {
		// call to super with message, no throwable, suppression, and no stacktrace
		super("", null, true, false);
	}
}
