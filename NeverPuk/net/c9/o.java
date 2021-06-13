package net.c9;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecureTextureException;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import net.xn;
import net.c9.b;
import net.c9.y;
import net.y.uh;
import net.y.um;
import net.yz.m_;

public class o {
   private static final ExecutorService N = new ThreadPoolExecutor(0, 2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
   private final net.n9.e d;
   private final File a;
   private final MinecraftSessionService u;
   private final LoadingCache q;

   public o(net.n9.e var1, File var2, MinecraftSessionService var3) {
      this.d = var1;
      this.a = var2;
      this.u = var3;
      this.q = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build(new CacheLoader() {
         public Map H(GameProfile var1) throws Exception {
            return net.nn.j.b().Y().getTextures(var1, false);
         }
      });
   }

   public m_ i(MinecraftProfileTexture var1, Type var2) {
      return this.i(var1, var2, (o.t)null);
   }

   public m_ i(final MinecraftProfileTexture var1, final Type var2, @Nullable final o.t var3) {
      b.K();
      final m_ var5 = new m_("skins/" + var1.getHash());
      net.n9.t var6 = this.d.m(var5);
      if(var3 != null) {
         var3.d(var2, var5, var1);
         File var7 = new File(this.a, var1.getHash().length() > 2?var1.getHash().substring(0, 2):"xx");
         File var8 = new File(var7, var1.getHash());
         final net.y.q var9 = var2 == Type.SKIN?new net.y.q():null;
         uh var10 = new uh(var8, var1.getUrl(), y.H(), new um() {
            public BufferedImage i(BufferedImage var1x) {
               int[] var2x = b.K();
               if(var9 != null) {
                  var1x = var9.i(var1x);
               }

               return var1x;
            }

            public void X() {
               int[] var1x = b.K();
               if(var9 != null) {
                  var9.X();
               }

               if(var3 != null) {
                  var3.d(var2, var5, var1);
               }

            }

            private static xn a(xn var0) {
               return var0;
            }
         });
         this.d.E(var5, var10);
      }

      return var5;
   }

   public void H(final GameProfile var1, final o.t var2, final boolean var3) {
      N.submit(new Runnable() {
         public void run() {
            b.K();
            final HashMap var2x = Maps.newHashMap();
            var2x.putAll(o.this.u.getTextures(var1, var3));
            if(var2x.isEmpty() && var1.getId().equals(net.nn.j.b().L().w().getId())) {
               var1.getProperties().clear();
               var1.getProperties().putAll(net.nn.j.b().Q());
               var2x.putAll(o.this.u.getTextures(var1, false));
            }

            net.nn.j.b().d(new Runnable() {
               public void run() {
                  int[] var1x = b.K();
                  if(var2x.containsKey(Type.SKIN)) {
                     o.this.i((MinecraftProfileTexture)var2x.get(Type.SKIN), Type.SKIN, var2);
                  }

                  if(var2x.containsKey(Type.CAPE)) {
                     o.this.i((MinecraftProfileTexture)var2x.get(Type.CAPE), Type.CAPE, var2);
                  }

               }

               private static xn a(xn var0) {
                  return var0;
               }
            });
         }

         private static InsecureTextureException a(InsecureTextureException var0) {
            return var0;
         }
      });
   }

   public Map Y(GameProfile var1) {
      return (Map)this.q.getUnchecked(var1);
   }

   private static xn a(xn var0) {
      return var0;
   }

   public interface t {
      void d(Type var1, m_ var2, MinecraftProfileTexture var3);
   }
}
