package net;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Iterator;
import net.xn;
import net.zk;
import net.cb.t;
import net.cr.n;
import net.n0.ks;
import net.nm.i;
import net.nv.s;
import net.nx.f;
import net.r.h;
import net.u.j;
import net.y7.r;
import net.yz.c;
import net.yz.p;

public class wn {
   public static final wn Z = new wn(0, new net.yz.m_[0], new net.yz.m_[0], s.e.n);
   private final int e;
   private final net.yz.m_[] I;
   private final net.yz.m_[] T;
   private final s.e n;

   public wn(int var1, net.yz.m_[] var2, net.yz.m_[] var3, s.e var4) {
      this.e = var1;
      this.I = var2;
      this.T = var3;
      this.n = var4;
   }

   public void W(final h var1) {
      var1.E(this.e);
      zk.l.p();
      r var3 = (new r.g(var1.j())).n(var1).w();
      boolean var4 = false;
      net.yz.m_[] var5 = this.I;
      int var6 = var5.length;
      int var7 = 0;
      if(var7 < var6) {
         net.yz.m_ var8 = var5[var7];
         Iterator var9 = var1.hl.o().k(var8).g(var1.Q(), var3).iterator();
         if(var9.hasNext()) {
            ks var10 = (ks)var9.next();
            if(var1.p(var10)) {
               var1.hl.L((net.r.r)null, var1.b, var1.hS, var1.hr, net.nb.l.oM, p.PLAYERS, 0.2F, ((var1.Q().nextFloat() - var1.Q().nextFloat()) * 0.7F + 1.0F) * 2.0F);
               var4 = true;
            }

            i var11 = var1.Y(var10, false);
            if(var11 != null) {
               var11.F();
               var11.l(var1.Q());
            }
         }

         ++var7;
      }

      if(this.T.length > 0) {
         var1.x(this.T);
      }

      final f var13 = var1.t9;
      s var14 = this.n.z(var13.J());
      net.nv.f var16 = new net.nv.f() {
         public String Q() {
            return var1.Q();
         }

         public t b() {
            return var1.b();
         }

         public void r(t var1x) {
         }

         public boolean n(int var1x, String var2) {
            boolean var3 = zk.l.p();
            return var1x <= 2;
         }

         public j z() {
            return var1.z();
         }

         public net.u.r A() {
            return var1.A();
         }

         public net.yv.r T() {
            return var1.hl;
         }

         public net.ne.l P() {
            return var1;
         }

         public boolean x() {
            return var13.w1[0].N().b("commandBlockOutput");
         }

         public void n(net.nv.l var1x, int var2) {
            var1.n(var1x, var2);
         }

         public f E() {
            return var1.E();
         }

         private static xn a(xn var0) {
            return var0;
         }
      };
      var13.J().W(var14, var16);
   }

   public String toString() {
      return "AdvancementRewards{experience=" + this.e + ", loot=" + Arrays.toString(this.I) + ", recipes=" + Arrays.toString(this.T) + ", function=" + this.n + '}';
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class l implements JsonDeserializer {
      public wn N(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         zk.l.D();
         JsonObject var5 = c.V(var1, "rewards");
         int var6 = c.t(var5, "experience", 0);
         JsonArray var7 = c.D(var5, "loot", new JsonArray());
         net.yz.m_[] var8 = new net.yz.m_[var7.size()];
         int var9 = 0;
         if(var9 < var8.length) {
            var8[var9] = new net.yz.m_(c.m(var7.get(var9), "loot[" + var9 + "]"));
            ++var9;
         }

         JsonArray var14 = c.D(var5, "recipes", new JsonArray());
         net.yz.m_[] var10 = new net.yz.m_[var14.size()];
         byte var11 = 0;
         if(var11 < var10.length) {
            var10[var11] = new net.yz.m_(c.m(var14.get(var11), "recipes[" + var11 + "]"));
            net.cr.s var12 = n.o(var10[var11]);
            throw new JsonSyntaxException("Unknown recipe \'" + var10[var11] + "\'");
         } else {
            s.e var15;
            if(var5.has("function")) {
               var15 = new s.e(new net.yz.m_(c.X(var5, "function")));
            } else {
               var15 = s.e.n;
            }

            return new wn(var6, var8, var10, var15);
         }
      }

      private static JsonParseException a(JsonParseException var0) {
         return var0;
      }
   }
}
