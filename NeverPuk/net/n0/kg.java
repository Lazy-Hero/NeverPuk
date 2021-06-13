package net.n0;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.b2;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.ni.s0;
import net.y9.rp;
import net.yz.ad;
import net.yz.aq;
import org.apache.commons.lang3.StringUtils;

public class kg extends y {
   private static final String[] N = new String[]{"skeleton", "wither", "zombie", "char", "creeper", "dragon"};

   public kg() {
      this.M(net.ys.r.X);
      this.d(0);
      this.z(true);
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      int[] var9 = kw.b();
      if(var5 == aq.DOWN) {
         return ad.FAIL;
      } else {
         net.yw.n var10 = var2.Z(var3);
         net.y9.l var11 = var10.Q();
         boolean var12 = var11.X(var2, var3);
         if(!var12) {
            if(!var2.Z(var3).n().B()) {
               return ad.FAIL;
            }

            var3 = var3.C(var5);
         }

         ks var13 = var1.o((net.yz.k)var4);
         if(var1.n(var3, var5, var13) && net.nb.f.dB.J(var2, var3)) {
            if(var2.x) {
               return ad.SUCCESS;
            } else {
               var2.k(var3, net.nb.f.dB.p().s(rp.N, var5), 11);
               int var14 = 0;
               if(var5 == aq.UP) {
                  var14 = net.u.t.L((double)(var1.hN * 16.0F / 360.0F) + 0.5D) & 15;
               }

               net.ni.v var15 = var2.L(var3);
               if(var15 instanceof s0) {
                  s0 var16 = (s0)var15;
                  if(var13.n() == 3) {
                     GameProfile var17 = null;
                     if(var13.D()) {
                        net.nj.f var18 = var13.o();
                        if(var18.K("SkullOwner", 10)) {
                           var17 = net.nj.e.g(var18.o("SkullOwner"));
                        } else if(var18.K("SkullOwner", 8) && !StringUtils.isBlank(var18.J("SkullOwner"))) {
                           var17 = new GameProfile((UUID)null, var18.J("SkullOwner"));
                        }
                     }

                     var16.B(var17);
                  }

                  var16.M(var13.n());
                  var16.T(var14);
                  net.nb.f.dB.w(var2, var3, var16);
               }

               if(var1 instanceof net.r.h) {
                  b2.D.a((net.r.h)var1, var3, var13);
               }

               var13.H(1);
               return ad.SUCCESS;
            }
         } else {
            return ad.FAIL;
         }
      }
   }

   public void M(net.ys.r var1, net.yz.w var2) {
      if(this.a(var1)) {
         for(int var3 = 0; var3 < N.length; ++var3) {
            var2.add(new ks(this, 1, var3));
         }
      }

   }

   public int o(int var1) {
      return var1;
   }

   public String f(ks var1) {
      int var2 = var1.n();
      if(var2 >= N.length) {
         var2 = 0;
      }

      return super.z() + "." + N[var2];
   }

   public String m(ks var1) {
      if(var1.n() == 3 && var1.D()) {
         if(var1.o().K("SkullOwner", 8)) {
            return net.yq.e.x("item.skull.player.name", new Object[]{var1.o().J("SkullOwner")});
         }

         if(var1.o().K("SkullOwner", 10)) {
            net.nj.f var2 = var1.o().o("SkullOwner");
            if(var2.K("Name", 8)) {
               return net.yq.e.x("item.skull.player.name", new Object[]{var2.J("Name")});
            }
         }
      }

      return super.m(var1);
   }

   public boolean v(net.nj.f var1) {
      super.v(var1);
      if(var1.K("SkullOwner", 8) && !StringUtils.isBlank(var1.J("SkullOwner"))) {
         GameProfile var2 = new GameProfile((UUID)null, var1.J("SkullOwner"));
         var2 = s0.W(var2);
         var1.K("SkullOwner", net.nj.e.u(new net.nj.f(), var2));
         return true;
      } else {
         return false;
      }
   }

   static {
      String[] var10000 = new String[]{"skeleton", "wither", "zombie", "char", "creeper", "dragon"};
   }

   private static xn a(xn var0) {
      return var0;
   }
}
