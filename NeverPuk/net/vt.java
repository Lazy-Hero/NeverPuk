package net;

import java.awt.Color;
import net.db;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.nb.j;
import net.z.g;
import net.z.t;

public class vt extends mk {
   private final mc y;
   private final mc l;
   private final mc e;
   private float i;

   public vt() {
      super("HurtCam", or.Visuals);
      gn.Q.J.d(this.y = new mc("Gradient Hurt", this, true));
      gn.Q.J.d(this.e = new mc("Gradient Alpha", this, 70.0D, 10.0D, 255.0D, 10.0D));
      gn.Q.J.d(this.l = new mc("Gradient Color", this, (new Color(16777215)).getRGB(), true));
   }

   @mr
   public void p(db var1) {
      int var2 = j.V();
      if(p.sf != null || p.s8 != null) {
         if(this.y.Q() && p.sf.Xl > 0) {
            t var3 = new t(net.nn.j.b());
            float var4 = this.e.e();
            int var5 = (int)(var4 / 100.0F);
            if(Float.compare(this.i, var4 - (float)var5) < 0) {
               this.i += (float)var5;
            }

            if(this.i > var4 - (float)var5 && Float.compare(this.i, var4) != 0) {
               this.i = (float)((int)var4);
            }

            if(this.i != var4) {
               this.i = (float)((int)var4);
            }

            Color var6 = new Color(this.l.T());
            Color var7 = new Color(var6.getRed(), var6.getGreen(), var6.getBlue(), (int)var4);
            Color var8 = new Color(0, 0, 0, 0);
            g var9 = new g();
            var9.T(0, 0, (double)var3.u(), (double)(var3.v() - 505), var7.getRGB(), var8.getRGB());
            var9.T(0, 0, (double)var3.u(), (double)(var3.v() + 255), var8.getRGB(), var7.getRGB());
         }

      }
   }

   private static xn b(xn var0) {
      return var0;
   }
}
