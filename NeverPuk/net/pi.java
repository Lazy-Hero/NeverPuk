package net;

import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.gn;
import net.i7;
import net.ij;
import net.in;
import net.mw;
import net.sb;
import net.sr;
import net.xh;
import net.xk;
import net.xn;
import net.z_;
import net.nn.j;
import net.u.d;
import net.z.t;

public class pi implements in {
   private static final List X = new CopyOnWriteArrayList();

   public static void d(String var0, String var1, int var2, z_ var3) {
      ij var4 = E.sq;
      X.add(new i7(var0, var1, var3, var2 * 1000, var4));
   }

   public static void z(t var0) {
      d[] var1 = z_.P();
      if(gn.Q.j.d(sb.class).v()) {
         if(X.isEmpty()) {
            return;
         }

         int var2 = var0.v();
         int var3 = var0.u();
         int var4 = var2 - 50;
         Iterator var5 = X.iterator();
         if(var5.hasNext()) {
            i7 var6 = (i7)var5.next();
            xk var7 = var6.U();
            int var8 = var6.x() + E.sO.r(var6.B()) / 2;
            if(!var6.X().Z((double)var6.J())) {
               var6.N = mw.g(var6.N, (double)var8, 0.57D * j.Y / 35.0D);
               var7.i((double)(var3 - var8), (double)var4, 0.6000000238418579D * j.Y);
            }

            var6.N = mw.g(0.0D, var6.N, 0.57D * j.Y / 35.0D);
            if(E.sf != null && E.s8 != null && (var6.x() > var3 || E.sf.x % 40 == 0)) {
               X.remove(var6);
            }

            var4 = var4 + 35;
            float var9 = (float)var7.T();
            float var10 = (float)var7.p();
            net.y.d.c();
            net.y.d.l(3089);
            xh.Z((float)((double)var3 - var6.N), var10, (float)var3, (double)(var10 + 30.0F));
            xh.J((double)var9, (double)var10, (double)var3, (double)(var10 + 28.0F), (new Color(11, 11, 11)).getRGB());
            xh.J((double)var9, (double)(var10 + 1.0F), (double)(var9 + (float)((long)var8 * ((long)var6.J() - var6.X().U()) / (long)var6.J())), (double)(var10 - 1.0F), var6.G().t());
            if(var6.G() == z_.ERROR) {
               xh.T(new net.yz.m_("neverhook/danger.png"), var9 + 3.0F, var10 + 5.0F, 17.0F, 17.0F, new Color(255, 100, 100));
            }

            if(var6.G() == z_.INFO) {
               xh.T(new net.yz.m_("neverhook/info1.png"), var9 + 2.0F, var10 + 5.0F, 19.0F, 17.0F, new Color(100, 100, 255));
            }

            if(var6.G() == z_.SUCCESS) {
               xh.T(new net.yz.m_("neverhook/success.png"), var9 + 2.5F, var10 + 5.0F, 19.0F, 17.0F, new Color(100, 255, 100));
            }

            if(var6.G() == z_.WARNING) {
               xh.T(new net.yz.m_("neverhook/warning.png"), var9 + 2.0F, var10 + 3.0F, 21.0F, 21.0F, new Color(255, 211, 53));
            }

            if(!sr.a.Q()) {
               gn.y().i(var6.y(), var9 + 25.0F, var10 + 6.0F, -1);
               gn.y().i(var6.B(), var9 + 25.0F, var10 + 17.0F, -1);
            }

            E.sO.U(var6.y(), var9 + 25.0F, var10 + 6.0F, -1);
            E.sO.U(var6.B(), var9 + 25.0F, var10 + 17.0F, -1);
            net.y.d.U(3089);
            net.y.d.Y();
            var4 = var4 - 35;
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
