package net.yp;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.util.Map;
import javax.annotation.Nullable;
import net.xn;
import net.c9.y;
import net.cb.t;
import net.no.s3;
import net.yp.v;
import net.yv.o9;
import net.yz.m_;

public class b {
   private final GameProfile H;
   Map U = Maps.newEnumMap(Type.class);
   private o9 S;
   private int j;
   private boolean V;
   private String N;
   private t J;
   private int n;
   private int c;
   private long v;
   private long F;
   private long I;

   public b(GameProfile var1) {
      this.H = var1;
   }

   public b(s3.w var1) {
      this.H = var1.o();
      this.S = var1.n();
      this.j = var1.Y();
      this.J = var1.b();
   }

   public GameProfile J() {
      return this.H;
   }

   public o9 K() {
      return this.S;
   }

   protected void w(o9 var1) {
      this.S = var1;
   }

   public int g() {
      return this.j;
   }

   protected void P(int var1) {
      this.j = var1;
   }

   public boolean W() {
      return this.R() != null;
   }

   public String j() {
      String var1 = v.C();
      return this.N == null?y.k(this.H.getId()):this.N;
   }

   public m_ R() {
      this.r();
      return (m_)MoreObjects.firstNonNull(this.U.get(Type.SKIN), y.l(this.H.getId()));
   }

   @Nullable
   public m_ S() {
      this.r();
      return (m_)this.U.get(Type.CAPE);
   }

   @Nullable
   public m_ q() {
      this.r();
      return (m_)this.U.get(Type.ELYTRA);
   }

   @Nullable
   public net.nc.y L() {
      return net.nn.j.b().s8.J().A(this.J().getName());
   }

   protected void r() {
      String var1 = v.C();
      if(!this.V) {
         this.V = true;
         net.nn.j.b().s().H(this.H, new net.c9.o() {
            public void d(Type var1, m_ var2, MinecraftProfileTexture var3) {
               String var4 = v.C();
               switch(null.l[var1.ordinal()]) {
               case 1:
                  b.this.U.put(Type.SKIN, var2);
                  b.this.N = var3.getMetadata("model");
                  if(b.this.N != null) {
                     break;
                  }

                  b.this.N = "default";
               case 2:
                  b.this.U.put(Type.CAPE, var2);
               case 3:
                  b.this.U.put(Type.ELYTRA, var2);
               }

            }

            private static xn a(xn var0) {
               return var0;
            }
         }, true);
      }

   }

   public void M(@Nullable t var1) {
      this.J = var1;
   }

   @Nullable
   public t F() {
      return this.J;
   }

   public int S() {
      return this.n;
   }

   public void H(int var1) {
      this.n = var1;
   }

   public int z() {
      return this.c;
   }

   public void e(int var1) {
      this.c = var1;
   }

   public long G() {
      return this.v;
   }

   public void n(long var1) {
      this.v = var1;
   }

   public long H() {
      return this.F;
   }

   public void Y(long var1) {
      this.F = var1;
   }

   public long k() {
      return this.I;
   }

   public void x(long var1) {
      this.I = var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
