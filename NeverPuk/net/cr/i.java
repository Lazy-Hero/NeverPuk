package net.cr;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.xn;
import net.cr.j;
import net.n0.ks;
import net.n0.kw;
import net.n0.yw;
import net.nb.f;
import net.y9.li;

public class i {
   private static final i L = new i();
   private final Map i = Maps.newHashMap();
   private final Map x = Maps.newHashMap();

   public static i z() {
      return L;
   }

   private i() {
      this.e(f.u7, new ks(net.nb.j.S1), 0.7F);
      this.e(f.z, new ks(net.nb.j.F), 1.0F);
      this.e(f.TT, new ks(net.nb.j.B), 1.0F);
      this.e(f.TF, new ks(f.Tm), 0.1F);
      this.X(net.nb.j.WC, new ks(net.nb.j.Wh), 0.35F);
      this.X(net.nb.j.U, new ks(net.nb.j.S4), 0.35F);
      this.X(net.nb.j.Y0, new ks(net.nb.j.Y6), 0.35F);
      this.X(net.nb.j.S2, new ks(net.nb.j.W4), 0.35F);
      this.X(net.nb.j.R, new ks(net.nb.j.S8), 0.35F);
      this.e(f.TD, new ks(f.oy), 0.1F);
      this.a(new ks(f.TM, 1, li.H), new ks(f.TM, 1, li.k), 0.1F);
      this.X(net.nb.j.v, new ks(net.nb.j.Yp), 0.3F);
      this.e(f.uz, new ks(f.oY), 0.35F);
      this.e(f.dW, new ks(net.nb.j.n, 1, kw.GREEN.G()), 0.2F);
      this.e(f.u6, new ks(net.nb.j.u, 1, 1), 0.15F);
      this.e(f.ub, new ks(net.nb.j.u, 1, 1), 0.15F);
      this.e(f.m, new ks(net.nb.j.WL), 1.0F);
      this.X(net.nb.j.We, new ks(net.nb.j.W2), 0.35F);
      this.e(f.R, new ks(net.nb.j.W6), 0.1F);
      this.a(new ks(f.um, 1, 1), new ks(f.um, 1, 0), 0.15F);
      this.X(net.nb.j.Y1, new ks(net.nb.j.WV), 0.1F);

      for(yw.i var4 : yw.i.values()) {
         if(var4.i()) {
            this.a(new ks(net.nb.j.YB, 1, var4.W()), new ks(net.nb.j.YY, 1, var4.W()), 0.35F);
         }
      }

      this.e(f.oK, new ks(net.nb.j.u), 0.1F);
      this.e(f.uT, new ks(net.nb.j.A), 0.7F);
      this.e(f.dT, new ks(net.nb.j.n, 1, kw.BLUE.G()), 0.2F);
      this.e(f.s, new ks(net.nb.j.Su), 0.2F);
      this.X(net.nb.j.YO, new ks(net.nb.j.SI), 0.1F);
      this.X(net.nb.j.Wa, new ks(net.nb.j.SI), 0.1F);
      this.X(net.nb.j.Wd, new ks(net.nb.j.SI), 0.1F);
      this.X(net.nb.j.Yc, new ks(net.nb.j.SI), 0.1F);
      this.X(net.nb.j.X, new ks(net.nb.j.SI), 0.1F);
      this.X(net.nb.j.YC, new ks(net.nb.j.SI), 0.1F);
      this.X(net.nb.j.Wv, new ks(net.nb.j.SI), 0.1F);
      this.X(net.nb.j.Ye, new ks(net.nb.j.SI), 0.1F);
      this.X(net.nb.j.O, new ks(net.nb.j.SI), 0.1F);
      this.X(net.nb.j.j, new ks(net.nb.j.SI), 0.1F);
      this.X(net.nb.j.YE, new ks(net.nb.j.SI), 0.1F);
      this.X(net.nb.j.Y_, new ks(net.nb.j.SI), 0.1F);
      this.X(net.nb.j.YS, new ks(net.nb.j.SI), 0.1F);
      this.X(net.nb.j.z, new ks(net.nb.j.SI), 0.1F);
      this.X(net.nb.j.YW, new ks(net.nb.j.Ww), 0.1F);
      this.X(net.nb.j.SW, new ks(net.nb.j.Ww), 0.1F);
      this.X(net.nb.j.G, new ks(net.nb.j.Ww), 0.1F);
      this.X(net.nb.j.SN, new ks(net.nb.j.Ww), 0.1F);
      this.X(net.nb.j.SP, new ks(net.nb.j.Ww), 0.1F);
      this.X(net.nb.j.W, new ks(net.nb.j.Ww), 0.1F);
      this.X(net.nb.j.WR, new ks(net.nb.j.Ww), 0.1F);
      this.X(net.nb.j.WM, new ks(net.nb.j.Ww), 0.1F);
      this.X(net.nb.j.p, new ks(net.nb.j.Ww), 0.1F);
      this.X(net.nb.j.YQ, new ks(net.nb.j.Ww), 0.1F);
      this.a(new ks(f.Ty, 1, kw.WHITE.d()), new ks(f.Th), 0.1F);
      this.a(new ks(f.Ty, 1, kw.ORANGE.d()), new ks(f.oU), 0.1F);
      this.a(new ks(f.Ty, 1, kw.MAGENTA.d()), new ks(f.Y), 0.1F);
      this.a(new ks(f.Ty, 1, kw.LIGHT_BLUE.d()), new ks(f.n), 0.1F);
      this.a(new ks(f.Ty, 1, kw.YELLOW.d()), new ks(f.T3), 0.1F);
      this.a(new ks(f.Ty, 1, kw.LIME.d()), new ks(f.ux), 0.1F);
      this.a(new ks(f.Ty, 1, kw.PINK.d()), new ks(f.ua), 0.1F);
      this.a(new ks(f.Ty, 1, kw.GRAY.d()), new ks(f.uC), 0.1F);
      this.a(new ks(f.Ty, 1, kw.SILVER.d()), new ks(f.un), 0.1F);
      this.a(new ks(f.Ty, 1, kw.CYAN.d()), new ks(f.dS), 0.1F);
      this.a(new ks(f.Ty, 1, kw.PURPLE.d()), new ks(f.dR), 0.1F);
      this.a(new ks(f.Ty, 1, kw.BLUE.d()), new ks(f.oA), 0.1F);
      this.a(new ks(f.Ty, 1, kw.BROWN.d()), new ks(f.O), 0.1F);
      this.a(new ks(f.Ty, 1, kw.GREEN.d()), new ks(f.d9), 0.1F);
      this.a(new ks(f.Ty, 1, kw.RED.d()), new ks(f.TN), 0.1F);
      this.a(new ks(f.Ty, 1, kw.BLACK.d()), new ks(f.de), 0.1F);
   }

   public void e(net.y9.l var1, ks var2, float var3) {
      this.X(net.n0.y.q(var1), var2, var3);
   }

   public void X(net.n0.y var1, ks var2, float var3) {
      this.a(new ks(var1, 1, 32767), var2, var3);
   }

   public void a(ks var1, ks var2, float var3) {
      this.i.put(var1, var2);
      this.x.put(var2, Float.valueOf(var3));
   }

   public ks Q(ks var1) {
      j.Y();
      Iterator var3 = this.i.entrySet().iterator();
      if(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         if(this.N(var1, (ks)var4.getKey())) {
            return (ks)var4.getValue();
         }
      }

      return ks.a;
   }

   private boolean N(ks var1, ks var2) {
      return var2.Z() == var1.Z() && (var2.n() == 32767 || var2.n() == var1.n());
   }

   public Map e() {
      return this.i;
   }

   public float A(ks var1) {
      j.Y();
      Iterator var3 = this.x.entrySet().iterator();
      if(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         if(this.N(var1, (ks)var4.getKey())) {
            return ((Float)var4.getValue()).floatValue();
         }
      }

      return 0.0F;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
