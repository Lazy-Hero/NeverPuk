package net;

import net._x;
import net.gn;
import net.mc;
import net.or;
import net.pi;
import net.sb;
import net.so;
import net.xk;
import net.xn;
import net.z_;
import net.nb.l;
import net.nn.j;

public class mk {
   protected static j p = j.b();
   private final or B;
   private final String M;
   public xk S = new xk(0.0F, 0.0F);
   public boolean m = true;
   private String C;
   private String E;
   private int D;
   private boolean g;
   private static String[] c;

   public mk(String var1, or var2) {
      this.M = var1;
      this.B = var2;
      this.g = false;
      this.D = 0;
   }

   public void c() {
      or.o();
      _x.K(this);
      if(!this.i().contains("ClickGui") && !this.i().contains("Client Font") && sb.x.Q()) {
         pi.d("Module", this.i() + " was Enabled!", 2, z_.INFO);
      }

      if(!this.i().contains("ClickGui") && !this.i().contains("Client Font") && gn.Q.j.d(so.class).v()) {
         p.sf.I(l.CK, 1.0F, 1.0F);
      }

   }

   public xk P() {
      return this.S;
   }

   public void H() {
      _x.E(this);
      if(!this.i().contains("ClickGui") && !this.i().contains("Client Font") && sb.x.Q()) {
         pi.d("Module", this.i() + " was Disabled!", 2, z_.INFO);
      }

      if(!this.i().contains("ClickGui") && !this.i().contains("Client Font") && gn.Q.j.d(so.class).v()) {
         p.sf.I(l.K_, 1.0F, 1.0F);
      }

   }

   public void g() {
      this.g = !this.g;
      if(this.g) {
         this.c();
      } else {
         this.H();
      }

   }

   public void W(mc... var1) {
      for(mc var5 : var1) {
         gn.Q.J.d(var5);
      }

   }

   public String i() {
      return this.M;
   }

   public int o() {
      return this.D;
   }

   public void z(int var1) {
      this.D = var1;
   }

   public or b() {
      return this.B;
   }

   public boolean v() {
      return this.g;
   }

   public void M(boolean var1) {
      _x.K(this);
      this.g = var1;
   }

   public String R() {
      return this.C == null?this.M:this.C;
   }

   public void A(String var1) {
      this.C = var1;
   }

   public boolean J() {
      return !this.m;
   }

   public boolean Z() {
      return this.m;
   }

   public void D(boolean var1) {
      this.m = var1;
   }

   public String n() {
      return this.E;
   }

   public void t(String var1) {
      this.A(this.i() + " " + net.cb.z.GRAY + var1);
   }

   static {
      F((String[])null);
   }

   public static void F(String[] var0) {
      c = var0;
   }

   public static String[] Y() {
      return c;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
