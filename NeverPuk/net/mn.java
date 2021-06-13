package net;

import java.util.HashSet;
import java.util.Set;
import net.mf;
import net.oq;
import net.xn;
import net.z9;
import net.n5.g;
import net.n5.m;
import net.nb.f;
import net.ne.l;
import net.u.j;
import net.u.t;
import net.y.u;
import net.yw.n;
import net.yz.aq;

public class mn {
   private l V = null;
   private double y = 0.0D;
   private double E = -2.147483648E9D;
   private double h = -2.147483648E9D;
   private double Z = -2.147483648E9D;
   private int z = 0;
   private boolean W = false;
   private long s = 0L;
   private Set N = new HashSet();
   private final j.v R = new j.v();

   public mn(l var1) {
      this.V = var1;
      this.y = (double)var1.A();
   }

   public void l(u var1) {
      String var2 = mf.O();
      if(z9.Se()) {
         long var3 = System.currentTimeMillis();
         if(var3 < this.s + 500L) {
            return;
         }

         this.s = var3;
      }

      double var39 = this.V.b - 0.5D;
      double var5 = this.V.hS - 0.5D + this.y;
      double var7 = this.V.hr - 0.5D;
      int var9 = oq.m(this.V);
      double var10 = var39 - this.E;
      double var12 = var5 - this.h;
      double var14 = var7 - this.Z;
      double var16 = 0.1D;
      if(Math.abs(var10) > var16 || Double.compare(Math.abs(var12), var16) > 0 || Math.abs(var14) > var16 || this.z != var9) {
         this.E = var39;
         this.h = var5;
         this.Z = var7;
         this.z = var9;
         this.W = false;
         net.cp.v var18 = var1.r();
         if(var18 != null) {
            this.R.V(t.L(var39), t.L(var5), t.L(var7));
            n var19 = var18.Z(this.R);
            net.y9.l var20 = var19.Q();
            this.W = var20 == f.uM;
         }

         HashSet var40 = new HashSet();
         aq var41 = (t.L(var39) & 15) >= 8?aq.EAST:aq.WEST;
         aq var21 = (t.L(var5) & 15) >= 8?aq.UP:aq.DOWN;
         aq var22 = (t.L(var7) & 15) >= 8?aq.SOUTH:aq.NORTH;
         j var23 = new j(var39, var5, var7);
         m var24 = var1.Q(var23);
         j var25 = this.D(var24, var23, var41);
         m var26 = var1.Q(var25);
         j var27 = this.D(var24, var23, var22);
         m var28 = var1.Q(var27);
         j var29 = this.D(var26, var25, var22);
         m var30 = var1.Q(var29);
         j var31 = this.D(var24, var23, var21);
         m var32 = var1.Q(var31);
         j var33 = this.D(var32, var31, var41);
         m var34 = var1.Q(var33);
         j var35 = this.D(var32, var31, var22);
         m var36 = var1.Q(var35);
         j var37 = this.D(var34, var33, var22);
         m var38 = var1.Q(var37);
         this.X(var24, this.N, var40);
         this.X(var26, this.N, var40);
         this.X(var28, this.N, var40);
         this.X(var30, this.N, var40);
         this.X(var32, this.N, var40);
         this.X(var34, this.N, var40);
         this.X(var36, this.N, var40);
         this.X(var38, this.N, var40);
         this.x(var1);
         this.N = var40;
      }

   }

   private j D(m var1, j var2, aq var3) {
      return var1.v(var3);
   }

   private void X(m var1, Set var2, Set var3) {
      g var4 = var1.N();
      if(!var4.i()) {
         var1.Z(false);
      }

      j var5 = var1.u().F();
      var2.remove(var5);
      var3.add(var5);
   }

   public void x(u var1) {
      for(j var3 : this.N) {
         m var4 = var1.Q(var3);
         this.X(var4, (Set)null, (Set)null);
      }

   }

   public l h() {
      return this.V;
   }

   public double G() {
      return this.E;
   }

   public double Z() {
      return this.h;
   }

   public double J() {
      return this.Z;
   }

   public int h() {
      return this.z;
   }

   public boolean j() {
      return this.W;
   }

   public double i() {
      return this.y;
   }

   public String toString() {
      return "Entity: " + this.V + ", offsetY: " + this.y;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
