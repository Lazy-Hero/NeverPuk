package net.yg;

import java.io.IOException;
import net.n2.h;
import net.n2.k;
import net.n2.t;
import net.u.d;
import net.yb.r;

public class o implements k {
   private int E;
   private String D;
   private int r;
   private t i;
   private static boolean A;

   public o() {
   }

   public o(String var1, int var2, t var3) {
      this.E = 340;
      this.D = var1;
      this.r = var2;
      this.i = var3;
   }

   public void E(h var1) throws IOException {
      b();
      this.E = var1.q();
      this.D = var1.Z(255);
      this.r = var1.readUnsignedShort();
      this.i = t.G(var1.q());
      if(d.y() == null) {
         D(false);
      }

   }

   public void O(h var1) throws IOException {
      L();
      var1.a(this.E);
      var1.R(this.D);
      var1.writeShort(this.r);
      var1.a(this.i.M());
      d.h(new d[2]);
   }

   public void K(r var1) {
      var1.v(this);
   }

   public t u() {
      return this.i;
   }

   public int Z() {
      return this.E;
   }

   public static void D(boolean var0) {
      A = var0;
   }

   public static boolean b() {
      return A;
   }

   public static boolean L() {
      boolean var0 = b();
      return true;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static {
      if(b()) {
         D(true);
      }

   }
}
