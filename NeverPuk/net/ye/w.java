package net.ye;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.xn;
import net.n0.ks;
import net.ni.s0;
import net.nk.fy;
import net.nl.z2;
import net.y6.jb;
import net.ye.p;
import net.ye.wr;
import net.yz.aq;
import org.apache.commons.lang3.StringUtils;

public class w implements wr {
   private final jb n;

   public w(jb var1) {
      this.n = var1;
   }

   public void t(net.ne.a var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      p.l();
      ks var10 = var1.U(z2.HEAD);
      if(!var10.B()) {
         net.n0.y var11 = var10.Z();
         net.nn.j var12 = net.nn.j.b();
         net.y.d.c();
         if(var1.Q()) {
            net.y.d.O(0.0F, 0.2F, 0.0F);
         }

         if(!(var1 instanceof net.yn.s) && !(var1 instanceof fy)) {
            boolean var19 = false;
         } else {
            boolean var10000 = true;
         }

         if(var1.H9() && !(var1 instanceof net.yn.s)) {
            float var20 = 2.0F;
            float var15 = 1.4F;
            net.y.d.O(0.0F, 0.5F * var8, 0.0F);
            net.y.d.W(0.7F, 0.7F, 0.7F);
            net.y.d.O(0.0F, 16.0F * var8, 0.0F);
         }

         this.n.I(0.0625F);
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         if(var11 == net.nb.j.Y9) {
            float var21 = 1.1875F;
            net.y.d.W(1.1875F, -1.1875F, -1.1875F);
            net.y.d.O(0.0F, 0.0625F, 0.0F);
            GameProfile var18 = null;
            if(var10.D()) {
               net.nj.f var16 = var10.o();
               if(var16.K("SkullOwner", 10)) {
                  var18 = net.nj.e.g(var16.o("SkullOwner"));
               } else if(var16.K("SkullOwner", 8)) {
                  String var17 = var16.J("SkullOwner");
                  if(!StringUtils.isBlank(var17)) {
                     var18 = s0.W(new GameProfile((UUID)null, var17));
                     var16.K("SkullOwner", net.nj.e.u(new net.nj.f(), var18));
                  }
               }
            }

            net.c5.p.S.j(-0.5F, 0.0F, -0.5F, aq.UP, 180.0F, var10.n(), var18, -1, var2);
         }

         if(!(var11 instanceof net.n0.j) || ((net.n0.j)var11).J() != z2.HEAD) {
            float var22 = 0.625F;
            net.y.d.O(0.0F, -0.25F, 0.0F);
            net.y.d.P(180.0F, 0.0F, 1.0F, 0.0F);
            net.y.d.W(0.625F, -0.625F, -0.625F);
            net.y.d.O(0.0F, 0.1875F, 0.0F);
            var12.h().L(var1, var10, net.ym.s.HEAD);
         }

         net.y.d.Y();
      }

   }

   public boolean y() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
