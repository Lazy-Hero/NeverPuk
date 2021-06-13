package com.sun.jna;

import com.sun.jna.Native;
import com.sun.jna.cs;

public class cq extends cs {
   private static final long serialVersionUID = 1L;
   public static final int r = Native.U;

   public cq() {
      this(0L);
   }

   public cq(long var1) {
      this(var1, false);
   }

   public cq(long var1, boolean var3) {
      super(r, var1, var3);
   }
}
