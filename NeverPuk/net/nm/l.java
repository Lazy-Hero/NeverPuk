package net.nm;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nm.w;
import net.yz.aq;

public class l extends net.ne.n {
   public l.t dN;

   public l(net.yv.r var1) {
      super(var1);
   }

   public l(net.yv.r var1, net.u.j var2, aq var3) {
      super(var1, var2);
      ArrayList var5 = Lists.newArrayList();
      w.h.u();
      int var6 = 0;
      l.t[] var7 = l.t.values();
      int var8 = var7.length;
      int var9 = 0;
      if(var9 < var8) {
         l.t var10 = var7[var9];
         this.dN = var10;
         this.b(var3);
         if(this.N()) {
            var5.add(var10);
            int var11 = var10.sizeX * var10.sizeY;
            if(var11 > var6) {
               var6 = var11;
            }
         }

         ++var9;
      }

      if(!var5.isEmpty()) {
         Iterator var12 = var5.iterator();
         if(var12.hasNext()) {
            l.t var13 = (l.t)var12.next();
            if(var13.sizeX * var13.sizeY < var6) {
               var12.remove();
            }
         }

         this.dN = (l.t)var5.get(this.p.nextInt(var5.size()));
      }

      this.b(var3);
   }

   public l(net.yv.r var1, net.u.j var2, aq var3, String var4) {
      this(var1, var2, var3);

      for(l.t var8 : l.t.values()) {
         if(var8.title.equals(var4)) {
            this.dN = var8;
            break;
         }
      }

      this.b(var3);
   }

   public void I(net.nj.f var1) {
      var1.b("Motive", this.dN.title);
      super.I(var1);
   }

   public void o(net.nj.f var1) {
      String var2 = var1.J("Motive");

      for(l.t var6 : l.t.values()) {
         if(var6.title.equals(var2)) {
            this.dN = var6;
         }
      }

      if(this.dN == null) {
         this.dN = l.t.KEBAB;
      }

      super.o(var1);
   }

   public int o() {
      return this.dN.sizeX;
   }

   public int E() {
      return this.dN.sizeY;
   }

   public void C(@Nullable net.ne.l var1) {
      if(this.hl.N().b("doEntityDrops")) {
         this.I(net.nb.l.Mr, 1.0F, 1.0F);
         if(var1 instanceof net.r.r) {
            net.r.r var2 = (net.r.r)var1;
            if(var2.a6.V) {
               return;
            }
         }

         this.O(new ks(net.nb.j.Yz), 0.0F);
      }

   }

   public void a() {
      this.I(net.nb.l.Hu, 1.0F, 1.0F);
   }

   public void S(double var1, double var3, double var5, float var7, float var8) {
      this.t(var1, var3, var5);
   }

   public void j(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      net.u.j var11 = this.uD.G(var1 - this.b, var3 - this.hS, var5 - this.hr);
      this.t((double)var11.t(), (double)var11.h(), (double)var11.y());
   }

   private static xn b(xn var0) {
      return var0;
   }

   public static enum t {
      KEBAB("Kebab", 16, 16, 0, 0),
      AZTEC("Aztec", 16, 16, 16, 0),
      ALBAN("Alban", 16, 16, 32, 0),
      AZTEC_2("Aztec2", 16, 16, 48, 0),
      BOMB("Bomb", 16, 16, 64, 0),
      PLANT("Plant", 16, 16, 80, 0),
      WASTELAND("Wasteland", 16, 16, 96, 0),
      POOL("Pool", 32, 16, 0, 32),
      COURBET("Courbet", 32, 16, 32, 32),
      SEA("Sea", 32, 16, 64, 32),
      SUNSET("Sunset", 32, 16, 96, 32),
      CREEBET("Creebet", 32, 16, 128, 32),
      WANDERER("Wanderer", 16, 32, 0, 64),
      GRAHAM("Graham", 16, 32, 16, 64),
      MATCH("Match", 32, 32, 0, 128),
      BUST("Bust", 32, 32, 32, 128),
      STAGE("Stage", 32, 32, 64, 128),
      VOID("Void", 32, 32, 96, 128),
      SKULL_AND_ROSES("SkullAndRoses", 32, 32, 128, 128),
      WITHER("Wither", 32, 32, 160, 128),
      FIGHTERS("Fighters", 64, 32, 0, 96),
      POINTER("Pointer", 64, 64, 0, 192),
      PIGSCENE("Pigscene", 64, 64, 64, 192),
      BURNING_SKULL("BurningSkull", 64, 64, 128, 192),
      SKELETON("Skeleton", 64, 48, 192, 64),
      DONKEY_KONG("DonkeyKong", 64, 48, 192, 112);

      public static final int MAX_NAME_LENGTH = "SkullAndRoses".length();
      public final String title;
      public final int sizeX;
      public final int sizeY;
      public final int offsetX;
      public final int offsetY;

      private t(String var3, int var4, int var5, int var6, int var7) {
         this.title = var3;
         this.sizeX = var4;
         this.sizeY = var5;
         this.offsetX = var6;
         this.offsetY = var7;
      }
   }
}
