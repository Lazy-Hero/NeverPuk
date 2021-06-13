package net.n0;

import com.google.common.collect.Sets;
import java.util.Set;
import net.xn;
import net.n0.k_;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;

public class kc extends k_ {
   private static final Set r = Sets.newHashSet(new net.y9.l[]{net.nb.f.j, net.nb.f.oK, net.nb.f.TD, net.nb.f.dw, net.nb.f.ud, net.nb.f.TT, net.nb.f.dn, net.nb.f.uR, net.nb.f.uW, net.nb.f.z, net.nb.f.oD, net.nb.f.TE, net.nb.f.u7, net.nb.f.Ti, net.nb.f.dT, net.nb.f.r, net.nb.f.T9, net.nb.f.R, net.nb.f.d4, net.nb.f.uU, net.nb.f.uT, net.nb.f.ul, net.nb.f.Tj, net.nb.f.oy, net.nb.f.Tt, net.nb.f.uE, net.nb.f.Td});

   protected kc(y.d var1) {
      super(1.0F, -2.8F, var1, r);
   }

   public boolean W(net.yw.n var1) {
      kw.b();
      net.y9.l var3 = var1.Q();
      if(var3 == net.nb.f.c) {
         return this.H.a() == 3;
      } else if(var3 != net.nb.f.ud && var3 != net.nb.f.TT) {
         if(var3 != net.nb.f.m && var3 != net.nb.f.du) {
            if(var3 != net.nb.f.uW && var3 != net.nb.f.z) {
               if(var3 != net.nb.f.TE && var3 != net.nb.f.u7) {
                  if(var3 != net.nb.f.Ti && var3 != net.nb.f.dT) {
                     if(var3 != net.nb.f.uT && var3 != net.nb.f.r) {
                        net.y1.l var4 = var1.n();
                        return var4 == net.y1.l.z?true:(var4 == net.y1.l.i?true:var4 == net.y1.l.Q);
                     } else {
                        return this.H.a() >= 2;
                     }
                  } else {
                     return this.H.a() >= 1;
                  }
               } else {
                  return this.H.a() >= 1;
               }
            } else {
               return this.H.a() >= 2;
            }
         } else {
            return this.H.a() >= 2;
         }
      } else {
         return this.H.a() >= 2;
      }
   }

   public float V(ks var1, net.yw.n var2) {
      net.y1.l var3 = var2.n();
      return var3 != net.y1.l.i && var3 != net.y1.l.Q && var3 != net.y1.l.z?super.V(var1, var2):this.t;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
