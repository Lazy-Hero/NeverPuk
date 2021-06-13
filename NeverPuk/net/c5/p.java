package net.c5;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.c5.e;
import net.c5.g;
import net.ne.l;
import net.ni.s0;
import net.r.r;
import net.y.d;
import net.y6.ec;
import net.y6.el;
import net.yz.aq;
import net.yz.m_;

public class p extends e {
   private static final m_ y = new m_("textures/entity/skeleton/skeleton.png");
   private static final m_ w = new m_("textures/entity/skeleton/wither_skeleton.png");
   private static final m_ U = new m_("textures/entity/zombie/zombie.png");
   private static final m_ i = new m_("textures/entity/creeper/creeper.png");
   private static final m_ l = new m_("textures/entity/enderdragon/dragon.png");
   private final net.y6.o G = new net.y6.o(0.0F);
   public static p S;
   private final el A = new el(0, 0, 64, 32);
   private final el E = new ec();

   public void x(s0 var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      aq var11 = aq.l(var1.B() & 7);
      float var12 = var1.j(var8);
      this.j((float)var2, (float)var4, (float)var6, var11, (float)(var1.F() * 360) / 16.0F, var1.Z(), var1.U(), var9, var12);
   }

   public void m(g var1) {
      super.m(var1);
      S = this;
   }

   public void j(float var1, float var2, float var3, aq var4, float var5, int var6, @Nullable GameProfile var7, int var8, float var9) {
      e.F();
      el var11 = this.A;
      if(var8 >= 0) {
         this.L(L[var8]);
         d.G(5890);
         d.c();
         d.W(4.0F, 2.0F, 1.0F);
         d.O(0.0625F, 0.0625F, 0.0625F);
         d.G(5888);
      }

      switch(var6) {
      case 0:
      default:
         this.L(y);
      case 1:
         this.L(w);
      case 2:
         this.L(U);
         var11 = this.E;
      case 3:
         var11 = this.E;
         m_ var12 = net.c9.y.H();
         net.nn.j var13 = net.nn.j.b();
         Map var14 = var13.s().Y(var7);
         if(var14.containsKey(Type.SKIN)) {
            var12 = var13.s().i((MinecraftProfileTexture)var14.get(Type.SKIN), Type.SKIN);
         }

         UUID var15 = r.D(var7);
         var12 = net.c9.y.l(var15);
         this.L(var12);
      case 4:
         this.L(i);
      case 5:
         this.L(l);
         net.y6.o var21 = this.G;
         d.c();
         d.j();
         if(var4 == aq.UP) {
            d.O(var1 + 0.5F, var2, var3 + 0.5F);
         }

         switch(null.Y[var4.ordinal()]) {
         case 1:
            d.O(var1 + 0.5F, var2 + 0.25F, var3 + 0.74F);
         case 2:
            d.O(var1 + 0.5F, var2 + 0.25F, var3 + 0.26F);
            var5 = 180.0F;
         case 3:
            d.O(var1 + 0.74F, var2 + 0.25F, var3 + 0.5F);
            var5 = 270.0F;
         case 4:
         default:
            d.O(var1 + 0.26F, var2 + 0.25F, var3 + 0.5F);
            var5 = 90.0F;
            float var24 = 0.0625F;
            d.F();
            d.W(-1.0F, -1.0F, 1.0F);
            d.m();
            if(var6 == 3) {
               d.f(d.q.PLAYER_SKIN);
            }

            var21.V((l)null, var9, 0.0F, 0.0F, var5, 0.0F, 0.0625F);
            d.Y();
            if(var8 >= 0) {
               d.G(5890);
               d.Y();
               d.G(5888);
            }

         }
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
