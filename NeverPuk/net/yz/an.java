package net.yz;

import java.io.OutputStream;
import java.io.PrintStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class an extends PrintStream {
   protected static final Logger O = LogManager.getLogger();
   protected final String l;

   public an(String var1, OutputStream var2) {
      super(var2);
      this.l = var1;
   }

   public void println(String var1) {
      this.x(var1);
   }

   public void println(Object var1) {
      this.x(String.valueOf(var1));
   }

   protected void x(String var1) {
      O.info("[{}]: {}", this.l, var1);
   }
}
