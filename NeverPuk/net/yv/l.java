package net.yv;

public enum l {
   PEACEFUL,
   EASY,
   NORMAL,
   HARD;

   private static final l[] r;
   private final int K;
   private final String Q;

   private l(int var3, String var4) {
      this.K = var3;
      this.Q = var4;
   }

   public int L() {
      return this.K;
   }

   public static l w(int var0) {
      return r[var0 % r.length];
   }

   public String E() {
      return this.Q;
   }

   static {
      // $FF: Couldn't be decompiled
   }
}
