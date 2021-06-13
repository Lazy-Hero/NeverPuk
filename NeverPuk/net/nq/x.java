package net.nq;

import net.xn;
import net.n0.ks;
import net.n0.y;
import net.nj.f;

public class x {
   private ks A;
   private ks e;
   private ks f;
   private int G;
   private int h;
   private boolean q;
   private static int[] L;

   public x(f var1) {
      this.A = ks.a;
      this.e = ks.a;
      this.f = ks.a;
      this.l(var1);
   }

   public x(ks var1, ks var2, ks var3) {
      this(var1, var2, var3, 0, 7);
   }

   public x(ks var1, ks var2, ks var3, int var4, int var5) {
      this.A = ks.a;
      this.e = ks.a;
      this.f = ks.a;
      this.A = var1;
      this.e = var2;
      this.f = var3;
      this.G = var4;
      this.h = var5;
      this.q = true;
   }

   public x(ks var1, ks var2) {
      this(var1, ks.a, var2);
   }

   public x(ks var1, y var2) {
      this(var1, new ks(var2));
   }

   public ks K() {
      return this.A;
   }

   public ks z() {
      return this.e;
   }

   public boolean m() {
      return !this.e.B();
   }

   public ks f() {
      return this.f;
   }

   public int V() {
      return this.G;
   }

   public int Y() {
      return this.h;
   }

   public void c() {
      ++this.G;
   }

   public void N(int var1) {
      this.h += var1;
   }

   public boolean y() {
      return this.G >= this.h;
   }

   public void y() {
      this.G = this.h;
   }

   public boolean S() {
      return this.q;
   }

   public void l(f var1) {
      R();
      f var3 = var1.o("buy");
      this.A = new ks(var3);
      f var4 = var1.o("sell");
      this.f = new ks(var4);
      if(var1.K("buyB", 10)) {
         this.e = new ks(var1.o("buyB"));
      }

      if(var1.K("uses", 99)) {
         this.G = var1.P("uses");
      }

      if(var1.K("maxUses", 99)) {
         this.h = var1.P("maxUses");
      }

      this.h = 7;
      if(var1.K("rewardExp", 1)) {
         this.q = var1.i("rewardExp");
      }

      this.q = true;
      if(net.u.d.y() == null) {
         H(new int[2]);
      }

   }

   public f L() {
      f var1 = new f();
      var1.K("buy", this.A.Z(new f()));
      var1.K("sell", this.f.Z(new f()));
      if(!this.e.B()) {
         var1.K("buyB", this.e.Z(new f()));
      }

      var1.r("uses", this.G);
      var1.r("maxUses", this.h);
      var1.c("rewardExp", this.q);
      return var1;
   }

   public static void H(int[] var0) {
      L = var0;
   }

   public static int[] R() {
      return L;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      H(new int[1]);
   }
}
