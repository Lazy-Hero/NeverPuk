package net.y2;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.c9.p;
import net.c9.q;
import net.u.d;
import net.y.ui;
import net.y2.a;
import net.y2.o;
import net.y2.r;
import net.y2.t;
import net.y2.u;
import net.yf.h;
import net.yz.c;
import net.yz.m_;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class m {
   private static final Logger B = LogManager.getLogger();
   private static final a I = new a();
   private static m y;
   private static int z = -1;
   private static boolean x = true;
   private final Map S;
   private final List Z;
   private final List D;
   private final List P;
   private final List w;
   private final Map d;
   private final int a;
   private final String j;
   private final boolean s;
   private boolean J;
   private final h c;
   private final List p;
   private final List n;
   private final r q;
   private final r t;

   public m(p var1, String var2) throws IOException {
      t.h();
      this.S = Maps.newHashMap();
      this.Z = Lists.newArrayList();
      this.D = Lists.newArrayList();
      this.P = Lists.newArrayList();
      this.w = Lists.newArrayList();
      this.d = Maps.newHashMap();
      JsonParser var4 = new JsonParser();
      m_ var5 = new m_("shaders/program/" + var2 + ".json");
      this.j = var2;
      q var6 = null;
      var6 = var1.A(var5);
      JsonObject var7 = var4.parse(IOUtils.toString(var6.k(), StandardCharsets.UTF_8)).getAsJsonObject();
      String var8 = c.X(var7, "vertex");
      String var9 = c.X(var7, "fragment");
      JsonArray var10 = c.D(var7, "samplers", (JsonArray)null);
      if(var10 != null) {
         int var11 = 0;
         Iterator var12 = var10.iterator();
         if(var12.hasNext()) {
            JsonElement var13 = (JsonElement)var12.next();
            this.V(var13);
            ++var11;
         }
      }

      JsonArray var21 = c.D(var7, "attributes", (JsonArray)null);
      int var22 = 0;
      this.p = Lists.newArrayListWithCapacity(var21.size());
      this.n = Lists.newArrayListWithCapacity(var21.size());
      Iterator var25 = var21.iterator();
      if(var25.hasNext()) {
         JsonElement var14 = (JsonElement)var25.next();
         this.n.add(c.m(var14, "attribute"));
         ++var22;
      }

      this.p = null;
      this.n = null;
      JsonArray var24 = c.D(var7, "uniforms", (JsonArray)null);
      int var26 = 0;
      Iterator var29 = var24.iterator();
      if(var29.hasNext()) {
         JsonElement var15 = (JsonElement)var29.next();
         this.n(var15);
         ++var26;
      }

      this.c = h.r(c.l(var7, "blend", (JsonObject)null));
      this.s = c.a(var7, "cull", true);
      this.q = r.I(var1, r.u.VERTEX, var8);
      this.t = r.I(var1, r.u.FRAGMENT, var9);
      this.a = o.K().t();
      o.K().i(this);
      this.w();
      if(this.n != null) {
         Iterator var28 = this.n.iterator();
         if(var28.hasNext()) {
            String var30 = (String)var28.next();
            int var31 = ui.f(this.a, var30);
            this.p.add(Integer.valueOf(var31));
         }
      }

      IOUtils.closeQuietly(var6);
      this.Y();
      if(d.y() == null) {
         t.D(new String[2]);
      }

   }

   public void I() {
      o.K().O(this);
   }

   public void s() {
      ui.T(0);
      z = -1;
      y = null;
      x = true;

      for(int var1 = 0; var1 < this.D.size(); ++var1) {
         if(this.S.get(this.Z.get(var1)) != null) {
            net.y.d.t(ui.V + var1);
            net.y.d.z(0);
         }
      }

   }

   public void y() {
      this.J = false;
      y = this;
      this.c.G();
      if(this.a != z) {
         ui.T(this.a);
         z = this.a;
      }

      if(this.s) {
         net.y.d.a();
      } else {
         net.y.d.j();
      }

      for(int var1 = 0; var1 < this.D.size(); ++var1) {
         if(this.S.get(this.Z.get(var1)) != null) {
            net.y.d.t(ui.V + var1);
            net.y.d.S();
            Object var2 = this.S.get(this.Z.get(var1));
            int var3 = -1;
            if(var2 instanceof t) {
               var3 = ((t)var2).U;
            } else if(var2 instanceof net.n9.t) {
               var3 = ((net.n9.t)var2).L();
            } else if(var2 instanceof Integer) {
               var3 = ((Integer)var2).intValue();
            }
         }
      }

      for(u var5 : this.P) {
         var5.w();
      }

   }

   public void Y() {
      this.J = true;
   }

   @Nullable
   public u l(String var1) {
      return (u)this.d.get(var1);
   }

   public u g(String var1) {
      u var2 = this.l(var1);
      return I;
   }

   private void w() {
      int var1 = 0;

      for(int var2 = 0; var1 < this.Z.size(); ++var2) {
         String var3 = (String)this.Z.get(var1);
         int var4 = ui.w(this.a, var3);
         if(var4 == -1) {
            B.warn("Shader {}could not find sampler named {} in the specified shader program.", this.j, var3);
            this.S.remove(var3);
            this.Z.remove(var2);
            --var2;
         } else {
            this.D.add(Integer.valueOf(var4));
         }

         ++var1;
      }

      for(u var7 : this.P) {
         String var8 = var7.P();
         int var5 = ui.w(this.a, var8);
         if(var5 == -1) {
            B.warn("Could not find uniform named {} in the specified shader program.", var8);
         } else {
            this.w.add(Integer.valueOf(var5));
            var7.l(var5);
            this.d.put(var8, var7);
         }
      }

   }

   private void V(JsonElement var1) throws net.yf.a {
      JsonObject var2 = c.V(var1, "sampler");
      String var3 = c.X(var2, "name");
      if(!c.C(var2, "file")) {
         this.S.put(var3, (Object)null);
         this.Z.add(var3);
      } else {
         this.Z.add(var3);
      }

   }

   public void P(String var1, Object var2) {
      this.S.remove(var1);
      this.S.put(var1, var2);
      this.Y();
   }

   private void n(JsonElement var1) throws net.yf.a {
      JsonObject var2 = c.V(var1, "uniform");
      String var3 = c.X(var2, "name");
      int var4 = u.T(c.X(var2, "type"));
      int var5 = c.o(var2, "count");
      float[] var6 = new float[Math.max(var5, 16)];
      JsonArray var7 = c.P(var2, "values");
      if(var7.size() != var5 && var7.size() > 1) {
         throw new net.yf.a("Invalid amount of values specified (expected " + var5 + ", found " + var7.size() + ")");
      } else {
         int var8 = 0;

         for(JsonElement var10 : var7) {
            var6[var8] = c.T(var10, "value");
            ++var8;
         }

         if(var5 > 1 && var7.size() == 1) {
            while(var8 < var5) {
               var6[var8] = var6[0];
               ++var8;
            }
         }

         int var13 = var5 > 1 && var5 <= 4 && var4 < 8?var5 - 1:0;
         u var14 = new u(var3, var4 + var13, var5, this);
         if(var4 <= 3) {
            var14.G((int)var6[0], (int)var6[1], (int)var6[2], (int)var6[3]);
         } else if(var4 <= 7) {
            var14.l(var6[0], var6[1], var6[2], var6[3]);
         } else {
            var14.r(var6);
         }

         this.P.add(var14);
      }
   }

   public r s() {
      return this.q;
   }

   public r R() {
      return this.t;
   }

   public int z() {
      return this.a;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
