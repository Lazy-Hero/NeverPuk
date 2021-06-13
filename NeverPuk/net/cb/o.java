package net.cb;

import net.cb.h;

public class o extends IllegalArgumentException {
   public o(h var1, String var2) {
      super(String.format("Error parsing: %s: %s", new Object[]{var1, var2}));
   }

   public o(h var1, int var2) {
      super(String.format("Invalid index %d requested for %s", new Object[]{Integer.valueOf(var2), var1}));
   }

   public o(h var1, Throwable var2) {
      super(String.format("Error while parsing: %s", new Object[]{var1}), var2);
   }
}
