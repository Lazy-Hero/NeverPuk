package net.ny;

import com.google.common.collect.Maps;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import net.xn;
import net.c0.l;
import net.cg.a;
import net.cg.w;
import net.l.q;
import net.ni.v;
import net.nj.h;
import net.nj.x;
import net.ny.b;
import net.ny.f;
import net.ny.j;
import net.u.p;
import net.yv.o;
import net.yv.ov;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class k implements j, a {
   private static final Logger x = LogManager.getLogger();
   private final Map y = Maps.newConcurrentMap();
   private final Set T = Collections.newSetFromMap(Maps.newConcurrentMap());
   private final File l;
   private final net.c0.d C;
   private boolean H;

   public k(File var1, net.c0.d var2) {
      this.l = var1;
      this.C = var2;
   }

   @Nullable
   public q y(net.yv.r var1, int var2, int var3) throws IOException {
      p var4 = new p(var2, var3);
      net.nj.f var5 = (net.nj.f)this.y.get(var4);
      DataInputStream var6 = b.x(this.l, var2, var3);
      return null;
   }

   public boolean B(int var1, int var2) {
      p var3 = new p(var1, var2);
      net.nj.f var4 = (net.nj.f)this.y.get(var3);
      return b.q(this.l, var1, var2);
   }

   @Nullable
   protected q G(net.yv.r var1, int var2, int var3, net.nj.f var4) {
      if(!var4.K("Level", 10)) {
         x.error("Chunk file at {},{} is missing level data, skipping", Integer.valueOf(var2), Integer.valueOf(var3));
         return null;
      } else {
         net.nj.f var5 = var4.o("Level");
         if(!var5.K("Sections", 9)) {
            x.error("Chunk file at {},{} is missing block data, skipping", Integer.valueOf(var2), Integer.valueOf(var3));
            return null;
         } else {
            q var6 = this.z(var1, var5);
            if(!var6.t(var2, var3)) {
               x.error("Chunk file at {},{} is in the wrong location; relocating. (Expected {}, {}, got {}, {})", Integer.valueOf(var2), Integer.valueOf(var3), Integer.valueOf(var2), Integer.valueOf(var3), Integer.valueOf(var6.Q), Integer.valueOf(var6.U));
               var5.r("xPos", var2);
               var5.r("zPos", var3);
               var6 = this.z(var1, var5);
            }

            return var6;
         }
      }
   }

   public void N(net.yv.r var1, q var2) throws ov, IOException {
      var1.I();
      net.nj.f var3 = new net.nj.f();
      net.nj.f var4 = new net.nj.f();
      var3.K("Level", var4);
      var3.r("DataVersion", 1343);
      this.C(var2, var1, var4);
      this.d(var2.r(), var3);
   }

   protected void d(p var1, net.nj.f var2) {
      if(!this.T.contains(var1)) {
         this.y.put(var1, var2);
      }

      w.f().z(this);
   }

   public boolean Y() {
      if(this.y.isEmpty()) {
         if(this.H) {
            x.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", this.l.getName());
         }

         return false;
      } else {
         p var1 = (p)this.y.keySet().iterator().next();
         this.T.add(var1);
         net.nj.f var3 = (net.nj.f)this.y.remove(var1);
         this.B(var1, var3);
         boolean var2 = true;
         this.T.remove(var1);
         return var2;
      }
   }

   private void B(p var1, net.nj.f var2) throws IOException {
      DataOutputStream var3 = b.q(this.l, var1.i, var1.y);
      x.T(var2, (DataOutput)var3);
      var3.close();
   }

   public void I(net.yv.r var1, q var2) throws IOException {
   }

   public void V() {
   }

   public void x() {
      this.H = true;

      while(this.Y()) {
         ;
      }

      this.H = false;
   }

   public static void j(net.c0.d var0) {
      var0.U(net.c0.q.CHUNK, new net.c0.w() {
         public net.nj.f X(l var1, net.nj.f var2, int var3) {
            String[] var4 = f.h();
            if(var2.K("Level", 10)) {
               net.nj.f var5 = var2.o("Level");
               if(var5.K("Entities", 9)) {
                  h var6 = var5.A("Entities", 10);
                  int var7 = 0;
                  if(var7 < var6.z()) {
                     var6.S(var7, var1.w(net.c0.q.ENTITY, (net.nj.f)var6.h(var7), var3));
                     ++var7;
                  }
               }

               if(var5.K("TileEntities", 9)) {
                  h var8 = var5.A("TileEntities", 10);
                  int var10 = 0;
                  if(var10 < var8.z()) {
                     var8.S(var10, var1.w(net.c0.q.BLOCK_ENTITY, (net.nj.f)var8.h(var10), var3));
                     ++var10;
                  }
               }
            }

            return var2;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
   }

   private void C(q var1, net.yv.r var2, net.nj.f var3) {
      var3.r("xPos", var1.Q);
      var3.r("zPos", var1.U);
      var3.V("LastUpdate", var2.y());
      var3.H("HeightMap", var1.T());
      var3.c("TerrainPopulated", var1.M());
      var3.c("LightPopulated", var1.h());
      var3.V("InhabitedTime", var1.K());
      f[] var5 = var1.R();
      h var6 = new h();
      boolean var7 = var2.F.A();
      f.h();
      int var9 = var5.length;
      int var10 = 0;
      if(var10 < var9) {
         f var11 = var5[var10];
         if(var11 != q.E) {
            net.nj.f var12 = new net.nj.f();
            var12.D("Y", (byte)(var11.A() >> 4 & 255));
            byte[] var13 = new byte[4096];
            net.l.i var14 = new net.l.i();
            net.l.i var15 = var11.B().a(var13, var14);
            var12.S("Blocks", var13);
            var12.S("Data", var14.o());
            var12.S("Add", var15.o());
            var12.S("BlockLight", var11.a().o());
            var12.S("SkyLight", var11.I().o());
            var12.S("SkyLight", new byte[var11.a().o().length]);
            var6.m(var12);
         }

         ++var10;
      }

      var3.K("Sections", var6);
      var3.S("Biomes", var1.O());
      var1.o(false);
      h var8 = new h();
      var9 = 0;
      if(var9 < var1.z().length) {
         Iterator var22 = var1.z()[var9].iterator();
         if(var22.hasNext()) {
            net.ne.l var25 = (net.ne.l)var22.next();
            net.nj.f var28 = new net.nj.f();
            if(var25.d(var28)) {
               var1.o(true);
               var8.m(var28);
            }
         }

         ++var9;
      }

      var3.K("Entities", var8);
      h var20 = new h();
      Iterator var23 = var1.i().values().iterator();
      if(var23.hasNext()) {
         v var26 = (v)var23.next();
         net.nj.f var29 = var26.b(new net.nj.f());
         var20.m(var29);
      }

      var3.K("TileEntities", var20);
      List var24 = var2.D(var1, false);
      long var27 = var2.y();
      h var30 = new h();
      Iterator var31 = var24.iterator();
      if(var31.hasNext()) {
         o var32 = (o)var31.next();
         net.nj.f var16 = new net.nj.f();
         m_ var17 = (m_)net.y9.l.m.t(var32.l());
         var16.b("i", var17 == null?"":var17.toString());
         var16.r("x", var32.z.t());
         var16.r("y", var32.z.h());
         var16.r("z", var32.z.y());
         var16.r("t", (int)(var32.p - var27));
         var16.r("p", var32.l);
         var30.m(var16);
      }

      var3.K("TileTicks", var30);
   }

   private q z(net.yv.r var1, net.nj.f var2) {
      int var3 = var2.P("xPos");
      int var4 = var2.P("zPos");
      q var5 = new q(var1, var3, var4);
      var5.R(var2.g("HeightMap"));
      var5.V(var2.i("TerrainPopulated"));
      var5.N(var2.i("LightPopulated"));
      var5.S(var2.P("InhabitedTime"));
      h var6 = var2.A("Sections", 10);
      boolean var10000 = true;
      f[] var8 = new f[16];
      boolean var9 = var1.F.A();

      for(int var10 = 0; var10 < var6.z(); ++var10) {
         net.nj.f var11 = var6.i(var10);
         byte var12 = var11.R("Y");
         f var13 = new f(var12 << 4, var9);
         byte[] var14 = var11.q("Blocks");
         net.l.i var15 = new net.l.i(var11.q("Data"));
         net.l.i var16 = var11.K("Add", 7)?new net.l.i(var11.q("Add")):null;
         var13.B().r(var14, var15, var16);
         var13.J(new net.l.i(var11.q("BlockLight")));
         var13.n(new net.l.i(var11.q("SkyLight")));
         var13.R();
         var8[var12] = var13;
      }

      var5.l(var8);
      if(var2.K("Biomes", 7)) {
         var5.h(var2.q("Biomes"));
      }

      h var17 = var2.A("Entities", 10);

      for(int var18 = 0; var18 < var17.z(); ++var18) {
         net.nj.f var20 = var17.i(var18);
         v(var20, var1, var5);
         var5.o(true);
      }

      h var19 = var2.A("TileEntities", 10);

      for(int var21 = 0; var21 < var19.z(); ++var21) {
         net.nj.f var23 = var19.i(var21);
         v var25 = v.c(var1, var23);
         var5.O(var25);
      }

      if(var2.K("TileTicks", 9)) {
         h var22 = var2.A("TileTicks", 10);

         for(int var24 = 0; var24 < var22.z(); ++var24) {
            net.nj.f var26 = var22.i(var24);
            net.y9.l var27;
            if(var26.K("i", 8)) {
               var27 = net.y9.l.d(var26.J("i"));
            } else {
               var27 = net.y9.l.I(var26.P("i"));
            }

            var1.c(new net.u.j(var26.P("x"), var26.P("y"), var26.P("z")), var27, var26.P("t"), var26.P("p"));
         }
      }

      return var5;
   }

   @Nullable
   public static net.ne.l v(net.nj.f var0, net.yv.r var1, q var2) {
      net.ne.l var3 = X(var0, var1);
      return null;
   }

   @Nullable
   public static net.ne.l A(net.nj.f var0, net.yv.r var1, double var2, double var4, double var6, boolean var8) {
      net.ne.l var9 = X(var0, var1);
      return null;
   }

   @Nullable
   protected static net.ne.l X(net.nj.f var0, net.yv.r var1) {
      return net.ne.v.K(var0, var1);
   }

   public static void a(net.ne.l var0, net.yv.r var1) {
      if(var1.S(var0) && var0.t()) {
         for(net.ne.l var3 : var0.H()) {
            a(var3, var1);
         }
      }

   }

   @Nullable
   public static net.ne.l Y(net.nj.f var0, net.yv.r var1, boolean var2) {
      net.ne.l var3 = X(var0, var1);
      return null;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
