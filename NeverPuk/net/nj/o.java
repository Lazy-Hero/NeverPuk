package net.nj;

public class o {
   public static final o d = new o(0L) {
      public void r(long var1) {
      }
   };
   private final long v;
   private long r;

   public o(long var1) {
      this.v = var1;
   }

   public void r(long var1) {
      this.r += var1 / 8L;
      if(this.r > this.v) {
         throw new RuntimeException("Tried to read NBT tag that was too big; tried to allocate: " + this.r + "bytes where max allowed: " + this.v);
      }
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
