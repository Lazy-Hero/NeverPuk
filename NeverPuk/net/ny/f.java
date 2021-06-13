package net.ny;

import net.i6;
import net.xn;
import net.y9.l;
import net.yw.n;

public class f {
   private final int a;
   private int G;
   private int R;
   private final net.l.k Z;
   private net.l.i z;
   private net.l.i T;
   private static String[] F;

   public f(int var1, boolean var2) {
      this.a = var1;
      this.Z = new net.l.k();
      this.z = new net.l.i();
      this.T = new net.l.i();
   }

   public n j(int var1, int var2, int var3) {
      return this.Z.C(var1, var2, var3);
   }

   public void v(int var1, int var2, int var3, n var4) {
      String[] var5 = h();
      if(i6.Bs.T(var4)) {
         var4 = (n)i6.b(var4, i6.Ut, new Object[0]);
      }

      n var6 = this.j(var1, var2, var3);
      l var7 = var6.Q();
      l var8 = var4.Q();
      if(var7 != net.nb.f.ou) {
         --this.G;
         if(var7.j()) {
            --this.R;
         }
      }

      if(var8 != net.nb.f.ou) {
         ++this.G;
         if(var8.j()) {
            ++this.R;
         }
      }

      this.Z.G(var1, var2, var3, var4);
   }

   public boolean g() {
      return this.G == 0;
   }

   public boolean V() {
      return this.R > 0;
   }

   public int A() {
      return this.a;
   }

   public void W(int var1, int var2, int var3, int var4) {
      this.T.i(var1, var2, var3, var4);
   }

   public int V(int var1, int var2, int var3) {
      return this.T.J(var1, var2, var3);
   }

   public void t(int var1, int var2, int var3, int var4) {
      this.z.i(var1, var2, var3, var4);
   }

   public int Q(int var1, int var2, int var3) {
      return this.z.J(var1, var2, var3);
   }

   public void R() {
      // $FF: Couldn't be decompiled
   }

   public net.l.k B() {
      return this.Z;
   }

   public net.l.i a() {
      return this.z;
   }

   public net.l.i I() {
      return this.T;
   }

   public void J(net.l.i var1) {
      this.z = var1;
   }

   public void n(net.l.i var1) {
      this.T = var1;
   }

   public static void F(String[] var0) {
      F = var0;
   }

   public static String[] h() {
      return F;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(h() != null) {
         F(new String[4]);
      }

   }
}
