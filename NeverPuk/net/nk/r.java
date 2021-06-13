package net.nk;

import net.xn;
import net.nk.i;
import net.nk.n;

public abstract class r extends i {
   protected static final net.k.v Cg = net.k.n.q(r.class, net.k.y.g);

   public r(net.yv.r var1) {
      super(var1);
   }

   protected void g() {
      super.g();
      this.G.r(Cg, Byte.valueOf((byte)0));
   }

   protected boolean i(int var1) {
      n.o.y();
      byte var3 = ((Byte)this.G.a(Cg)).byteValue();
      return (var3 & var1) != 0;
   }

   protected void o(int var1, boolean var2) {
      n.o.y();
      int var4 = ((Byte)this.G.a(Cg)).byteValue();
      if(var2) {
         var4 |= var1;
      }

      var4 = var4 & ~var1;
      this.G.d(Cg, Byte.valueOf((byte)(var4 & 255)));
   }

   public net.ne.u g() {
      return net.ne.u.ILLAGER;
   }

   public r.o y() {
      return r.o.CROSSED;
   }

   private static xn d(xn var0) {
      return var0;
   }

   public static enum o {
      CROSSED,
      ATTACKING,
      SPELLCASTING,
      BOW_AND_ARROW;
   }
}
