package net;

import java.util.Iterator;
import net.db;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.sf;
import net.xn;
import net.n0.ks;
import net.nn.j;
import net.y.d;
import net.y.t;
import net.y1.l;

public class vw extends mk {
   private final t n = j.b().K();
   private final mc W;

   public vw() {
      super("ArmorHUD", or.Visuals);
      gn.Q.J.d(this.W = new mc("Show Durability", this, true));
   }

   @mr
   public void R(db var1) {
      if(p.sf != null && p.s8 != null) {
         this.y();
      }

   }

   public void y() {
      net.nb.j.M();
      d.S();
      net.z.t var2 = new net.z.t(p);
      int var3 = var2.u() / 2;
      int var4 = 0;
      int var5 = (int)((float)(var2.v() - 65) - (p.sf.A(l.p)?sf.R:sf.R - 9.0F));
      Iterator var6 = p.sf.a8.P.iterator();
      if(var6.hasNext()) {
         ks var7 = (ks)var6.next();
         ++var4;
         if(var7.B()) {
            ;
         }

         int var8 = var3 - 90 + (9 - var4) * 20 + 2;
         d.B();
         this.n.t = 200.0F;
         this.n.M(var7, var8, var5);
         if(this.W.Q()) {
            this.n.G(p.sO, var7, var8, var5, "");
         }

         this.n.t = 0.0F;
         d.S();
         d.i();
         d.z();
         String var9 = var7.U() > 1?var7.U() + "":"";
         p.b.i(var9, (float)(var8 + 19 - 2 - p.x.s(var9)), (float)(var5 + 20), 16777215);
      }

      d.B();
      d.i();
   }

   private static xn b(xn var0) {
      return var0;
   }
}
