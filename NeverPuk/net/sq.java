package net;

import java.util.ArrayList;
import java.util.Objects;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zf;
import net.nb.b;
import net.ne.j;
import net.ne.l;
import net.u.d;
import net.yy.g;

public class sq extends mk {
   private final mc O;
   private boolean j;

   public sq() {
      super("Velocity", or.Combat);
      ArrayList var1 = new ArrayList();
      var1.add("Packet");
      var1.add("CustomMotion");
      var1.add("Matrix");
      gn.Q.J.d(new mc("Velocity mode", this, "Packet", var1));
      gn.Q.J.d(new mc("Vertical Percentage", this, 0.0D, 0.0D, 100.0D, 1.0D));
      gn.Q.J.d(new mc("Horizontal Percentage", this, 0.0D, 0.0D, 100.0D, 1.0D));
      gn.Q.J.d(this.O = new mc("Cancel Other Damage", this, true));
   }

   @mr
   public void c(zf var1) {
      j.D();
      String var3 = gn.Q.J.S("Velocity Mode").M();
      if(this.O.Q() && p.sf.Xl > 0 && var1.w() instanceof net.no.sp && (p.sf.J(b.j) || p.sf.J(b.e) || p.sf.a())) {
         var1.H(true);
      }

      if(!var3.equalsIgnoreCase("CustomMotion")) {
         this.t(var3);
      }

      label168: {
         if(var3.equalsIgnoreCase("Packet")) {
            if(!(var1.w() instanceof net.no.sp) && !(var1.w() instanceof net.no.so) || ((net.no.sp)var1.w()).F() != p.sf.G()) {
               break label168;
            }

            var1.H(true);
         }

         if(var3.equalsIgnoreCase("CustomMotion")) {
            double var4 = gn.Q.J.S("Horizontal Percentage").p();
            double var6 = gn.Q.J.S("Vertical Percentage").p();
            if(var3.equalsIgnoreCase("CustomMotion")) {
               this.t("H: " + var4 + "% V: " + var6 + "%");
               if(((net.no.sp)var1.w()).F() == p.sf.G()) {
                  if(var1.w() instanceof net.no.sp) {
                     l var8 = ((net.yp.v)Objects.requireNonNull(p.d())).z.S(((net.no.sp)var1.w()).F());
                     if(var8 instanceof g) {
                        if(Double.compare(var4, 0.0D) == 0 && Double.compare(var6, 0.0D) == 0) {
                           var1.H(true);
                           return;
                        }

                        if(Double.compare(var4, 100.0D) != 0) {
                           ((net.no.sp)var1.w()).O = (int)((double)(((net.no.sp)var1.w()).O / 100) * var4);
                           ((net.no.sp)var1.w()).N = (int)((double)(((net.no.sp)var1.w()).N / 100) * var4);
                        }

                        if(Double.compare(var6, 100.0D) != 0) {
                           ((net.no.sp)var1.w()).m = (int)((double)(((net.no.sp)var1.w()).m / 100) * var6);
                        }
                     }
                  }

                  if(var1.w() instanceof net.no.so) {
                     if(var4 == 0.0D && Double.compare(var6, 0.0D) == 0) {
                        var1.H(true);
                        return;
                     }

                     if(Double.compare(var4, 100.0D) != 0) {
                        ((net.no.so)var1.w()).e = (float)((int)((double)(((net.no.so)var1.w()).e / 100.0F) * var4));
                        ((net.no.so)var1.w()).d = (float)((int)((double)(((net.no.so)var1.w()).d / 100.0F) * var4));
                     }

                     if(var6 != 100.0D) {
                        ((net.no.so)var1.w()).J = (float)((int)((double)(((net.no.so)var1.w()).J / 100.0F) * var6));
                     }
                  }
               }
            }
         }
      }

      if(d.y() == null) {
         j.D("DAhsm");
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
