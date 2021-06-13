package net.n3;

import net.xn;
import net.cb.t;
import net.nv.f;
import net.u.d;
import net.yv.r;

public class e implements f {
   private final StringBuffer A = new StringBuffer();
   private final net.nx.f u;
   private static d[] s;

   public e(net.nx.f var1) {
      v();
      this.u = var1;
      d.h(new d[2]);
   }

   public String Q() {
      return "Rcon";
   }

   public void r(t var1) {
      v();
      this.A.append(var1.l());
      if(d.y() == null) {
         b(new d[2]);
      }

   }

   public boolean n(int var1, String var2) {
      return true;
   }

   public r T() {
      return this.u.T();
   }

   public boolean x() {
      return true;
   }

   public net.nx.f E() {
      return this.u;
   }

   public static void b(d[] var0) {
      s = var0;
   }

   public static d[] v() {
      return s;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(v() == null) {
         b(new d[5]);
      }

   }
}
