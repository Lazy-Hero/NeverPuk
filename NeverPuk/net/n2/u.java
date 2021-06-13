package net.n2;

public final class u extends RuntimeException {
   public static final u W = new u();

   private u() {
      this.setStackTrace(new StackTraceElement[0]);
   }

   public synchronized Throwable fillInStackTrace() {
      this.setStackTrace(new StackTraceElement[0]);
      return this;
   }
}
