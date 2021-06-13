package net;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import net.dr;
import net.gj;
import net.gn;
import net.or;
import net.sg;
import net.xn;
import net.u.d;
import net.y0.o;
import net.z.t;
import net.z.tu;
import org.lwjgl.input.Mouse;

public class pd extends tu {
   public static double F;
   public static dr D = new dr();
   private final ArrayList Z = new ArrayList();
   int Q = 10;
   private float J;

   public pd() {
      for(or var4 : or.values()) {
         this.Z.add(new gj(var4, this.Q, 10));
         this.Q += 113;
      }

   }

   public void v(int var1, int var2, float var3) {
      o.M();
      t var5 = new t(this.A);
      if(this.A.sf != null && this.A.s8 != null) {
         float var6 = 130.0F;
         int var7 = (int)(var6 / 100.0F);
         if(Float.compare(this.J, var6 - (float)var7) < 0) {
            this.J += (float)var7;
            d.h(new d[1]);
         }

         if(Float.compare(this.J, var6 - (float)var7) > 0 && Float.compare(this.J, var6) != 0) {
            this.J = (float)((int)var6);
         }

         if(this.J != var6) {
            this.J = (float)((int)var6);
         }

         Color var8 = new Color(gn.M().getRed(), gn.M().getGreen(), gn.M().getBlue(), (int)this.J);
         Color var9 = new Color(0, 0, 0, 0);
         if(sg.r.Q()) {
            D.C((float)var1, (float)var2);
         }

         this.T(0, 0, (double)var5.u(), (double)var5.v(), var8.getRGB(), var9.getRGB());
         Iterator var10 = this.Z.iterator();
         if(var10.hasNext()) {
            gj var11 = (gj)var10.next();
            var11.P(var1, var2);
            this.g();
         }
      }

   }

   public void g() {
      int var1 = Mouse.getDWheel();

      for(gj var3 : this.Z) {
         if(sg.L.Q()) {
            var3.O(var3.i() - 15);
         } else {
            var3.O(var3.i() - 15);
         }
      }

   }

   protected void C(int var1, int var2, int var3) throws IOException {
      for(gj var5 : this.Z) {
         var5.t(var1, var2, var3);
      }

      super.C(var1, var2, var3);
   }

   protected void E(int var1, int var2, int var3) {
      for(gj var5 : this.Z) {
         var5.J(var1, var2, var3);
      }

      super.E(var1, var2, var3);
   }

   public void x() {
      if(this.A.s4.w()) {
         this.A.s4.mr = null;
      }

      if(gn.Q.h != null) {
         gn.Q.h.W();
      }

   }

   public void L() {
      this.J = 0.0F;
   }

   protected void Q(char var1, int var2) throws IOException {
      for(gj var4 : this.Z) {
         var4.I(var1, var2);
      }

      super.Q(var1, var2);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
