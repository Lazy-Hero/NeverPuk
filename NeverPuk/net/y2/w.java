package net.y2;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.c9.p;
import net.c9.q;
import net.n9.e;
import net.y.d;
import net.y2.b;
import net.y2.t;
import net.y2.u;
import net.yz.c;
import net.yz.m_;
import org.apache.commons.io.IOUtils;
import org.lwjgl.util.vector.Matrix4f;

public class w {
   public final t X;
   public final p K;
   public final String o;
   public static final List F = Lists.newArrayList();
   public final Map M = Maps.newHashMap();
   public final List j = Lists.newArrayList();
   public Matrix4f L;
   public int g;
   public int t;
   public float P;
   public float w;

   public w(e var1, p var2, t var3, m_ var4) throws IOException, JsonSyntaxException {
      this.K = var2;
      this.X = var3;
      this.P = 0.0F;
      this.w = 0.0F;
      this.g = var3.b;
      this.t = var3.u;
      this.o = var4.toString();
      this.V();
      this.a(var1, var4);
   }

   public void a(e param1, m_ param2) throws IOException, JsonSyntaxException {
      // $FF: Couldn't be decompiled
   }

   private void j(JsonElement var1) throws net.yf.a {
      if(c.k(var1)) {
         this.R(var1.getAsString(), this.g, this.t);
      } else {
         JsonObject var2 = c.V(var1, "target");
         String var3 = c.X(var2, "name");
         int var4 = c.t(var2, "width", this.g);
         int var5 = c.t(var2, "height", this.t);
         if(this.M.containsKey(var3)) {
            throw new net.yf.a(var3 + " is already defined");
         }

         this.R(var3, var4, var5);
      }

   }

   private void P(e var1, JsonElement var2) throws IOException {
      t.h();
      JsonObject var4 = c.V(var2, "pass");
      String var5 = c.X(var4, "name");
      String var6 = c.X(var4, "intarget");
      String var7 = c.X(var4, "outtarget");
      t var8 = this.C(var6);
      t var9 = this.C(var7);
      if(var8 == null) {
         throw new net.yf.a("Input target \'" + var6 + "\' does not exist");
      } else if(var9 == null) {
         throw new net.yf.a("Output target \'" + var7 + "\' does not exist");
      } else {
         b var10 = this.h(var5, var8, var9);
         JsonArray var11 = c.D(var4, "auxtargets", (JsonArray)null);
         if(var11 != null) {
            int var12 = 0;
            Iterator var13 = var11.iterator();
            if(var13.hasNext()) {
               JsonElement var14 = (JsonElement)var13.next();
               JsonObject var15 = c.V(var14, "auxtarget");
               String var16 = c.X(var15, "name");
               String var17 = c.X(var15, "id");
               t var18 = this.C(var17);
               m_ var19 = new m_("textures/effect/" + var17 + ".png");
               q var20 = null;
               var20 = this.K.A(var19);
               IOUtils.closeQuietly(var20);
               var1.E(var19);
               net.n9.t var21 = var1.m(var19);
               int var22 = c.o(var15, "width");
               int var23 = c.o(var15, "height");
               boolean var24 = c.A(var15, "bilinear");
               if(var24) {
                  d.t(3553, 10241, 9729);
                  d.t(3553, 10240, 9729);
               }

               d.t(3553, 10241, 9728);
               d.t(3553, 10240, 9728);
               var10.X(var16, Integer.valueOf(var21.L()), var22, var23);
               var10.X(var16, var18, var18.A, var18.m);
               ++var12;
            }
         }

         JsonArray var26 = c.D(var4, "uniforms", (JsonArray)null);
         int var27 = 0;
         Iterator var29 = var26.iterator();
         if(var29.hasNext()) {
            JsonElement var30 = (JsonElement)var29.next();
            this.P(var30);
            ++var27;
         }

      }
   }

   private void P(JsonElement var1) throws net.yf.a {
      JsonObject var2 = c.V(var1, "uniform");
      String var3 = c.X(var2, "name");
      u var4 = ((b)F.get(F.size() - 1)).y().l(var3);
      throw new net.yf.a("Uniform \'" + var3 + "\' does not exist");
   }

   public t y(String var1) {
      return (t)this.M.get(var1);
   }

   public void R(String var1, int var2, int var3) {
      t var4 = new t(var2, var3, true);
      var4.X(0.0F, 0.0F, 0.0F, 0.0F);
      this.M.put(var1, var4);
      if(var2 == this.g && var3 == this.t) {
         this.j.add(var4);
      }

   }

   public void i() {
      for(t var2 : this.M.values()) {
         var2.E();
      }

      for(b var4 : F) {
         var4.K();
      }

      F.clear();
   }

   public b h(String var1, t var2, t var3) throws IOException {
      b var4 = new b(this.K, var1, var2, var3);
      F.add(F.size(), var4);
      return var4;
   }

   private void V() {
      this.L = new Matrix4f();
      this.L.setIdentity();
      this.L.m00 = 2.0F / (float)this.X.A;
      this.L.m11 = 2.0F / (float)(-this.X.m);
      this.L.m22 = -0.0020001999F;
      this.L.m33 = 1.0F;
      this.L.m03 = -1.0F;
      this.L.m13 = 1.0F;
      this.L.m23 = -1.0001999F;
   }

   public void h(int var1, int var2) {
      this.g = this.X.A;
      this.t = this.X.m;
      this.V();

      for(b var4 : F) {
         var4.M(this.L);
      }

      for(t var6 : this.j) {
         var6.H(var1, var2);
      }

   }

   public void C(float var1) {
      if(var1 < this.w) {
         this.P += 1.0F - this.w;
         this.P += var1;
      } else {
         this.P += var1 - this.w;
      }

      for(this.w = var1; this.P > 20.0F; this.P -= 20.0F) {
         ;
      }

      for(b var3 : F) {
         var3.C(this.P / 20.0F);
      }

   }

   public final String W() {
      return this.o;
   }

   private t C(String var1) {
      return null;
   }

   public List O() {
      return this.j;
   }

   public List q() {
      return F;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
