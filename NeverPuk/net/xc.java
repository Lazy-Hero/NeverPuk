package net;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;
import net.g4;
import net.p7;
import net.wn;
import net.xn;
import net.zk;
import net.cb.l;
import net.cb.t;
import net.n2.h;
import net.n6.o;
import net.u.d;
import net.yz.c;
import org.apache.commons.lang3.ArrayUtils;

public class xc {
   private final xc U;
   private final g4 x;
   private final wn y;
   private final net.yz.m_ n;
   private final Map A;
   private final String[][] p;
   private final Set t = Sets.newLinkedHashSet();
   private final t b;

   public xc(net.yz.m_ var1, @Nullable xc var2, @Nullable g4 var3, wn var4, Map var5, String[][] var6) {
      zk.l.p();
      this.n = var1;
      this.x = var3;
      this.A = ImmutableMap.copyOf(var5);
      this.U = var2;
      this.y = var4;
      this.p = var6;
      if(var2 != null) {
         var2.I(this);
      }

      if(var3 == null) {
         this.b = new l(var1.toString());
      }

      this.b = new l("[");
      this.b.E().i(var3.m().f());
      t var8 = var3.s().c();
      l var9 = new l("");
      t var10 = var8.c();
      var10.E().i(var3.m().f());
      var9.h(var10);
      var9.z("\n");
      var9.h(var3.j());
      var8.E().G(new o(o.z.SHOW_TEXT, var9));
      this.b.h(var8);
      this.b.z("]");
   }

   public xc.z R() {
      return new xc.z(this.U == null?null:this.U.S(), this.x, this.y, this.A, this.p);
   }

   @Nullable
   public xc P() {
      return this.U;
   }

   @Nullable
   public g4 y() {
      return this.x;
   }

   public wn t() {
      return this.y;
   }

   public String toString() {
      return "SimpleAdvancement{id=" + this.S() + ", parent=" + (this.U == null?"null":this.U.S()) + ", display=" + this.x + ", rewards=" + this.y + ", criteria=" + this.A + ", requirements=" + Arrays.deepToString(this.p) + '}';
   }

   public Iterable W() {
      return this.t;
   }

   public Map G() {
      return this.A;
   }

   public int D() {
      return this.p.length;
   }

   public void I(xc var1) {
      this.t.add(var1);
   }

   public net.yz.m_ S() {
      return this.n;
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof xc)) {
         return false;
      } else {
         xc var2 = (xc)var1;
         return this.n.equals(var2.n);
      }
   }

   public int hashCode() {
      return this.n.hashCode();
   }

   public String[][] A() {
      return this.p;
   }

   public t y() {
      return this.b;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class z {
      private final net.yz.m_ b;
      private xc A;
      private final g4 J;
      private final wn W;
      private final Map V;
      private final String[][] U;

      z(@Nullable net.yz.m_ var1, @Nullable g4 var2, wn var3, Map var4, String[][] var5) {
         this.b = var1;
         this.J = var2;
         this.W = var3;
         this.V = var4;
         this.U = var5;
      }

      public boolean U(Function var1) {
         if(this.b == null) {
            return true;
         } else {
            this.A = (xc)var1.apply(this.b);
            return this.A != null;
         }
      }

      public xc N(net.yz.m_ var1) {
         return new xc(var1, this.A, this.J, this.W, this.V, this.U);
      }

      public void Y(h var1) {
         if(this.b == null) {
            var1.writeBoolean(false);
         } else {
            var1.writeBoolean(true);
            var1.Q(this.b);
         }

         if(this.J == null) {
            var1.writeBoolean(false);
         } else {
            var1.writeBoolean(true);
            this.J.u(var1);
         }

         p7.X(this.V, var1);
         var1.a(this.U.length);

         for(String[] var5 : this.U) {
            var1.a(var5.length);

            for(String var9 : var5) {
               var1.R(var9);
            }
         }

      }

      public String toString() {
         return "Task Advancement{parentId=" + this.b + ", display=" + this.J + ", rewards=" + this.W + ", criteria=" + this.V + ", requirements=" + Arrays.deepToString(this.U) + '}';
      }

      public static xc.z o(JsonObject var0, JsonDeserializationContext var1) {
         boolean var2 = zk.l.D();
         net.yz.m_ var3 = var0.has("parent")?new net.yz.m_(c.X(var0, "parent")):null;
         g4 var4 = var0.has("display")?g4.S(c.b(var0, "display"), var1):null;
         wn var5 = (wn)c.n(var0, "rewards", wn.Z, var1, wn.class);
         Map var6 = p7.s(c.b(var0, "criteria"), var1);
         if(var6.isEmpty()) {
            throw new JsonSyntaxException("Advancement criteria cannot be empty");
         } else {
            JsonArray var7 = c.D(var0, "requirements", new JsonArray());
            String[][] var8 = new String[var7.size()][];
            int var9 = 0;
            if(var9 < var7.size()) {
               JsonArray var10 = c.m(var7.get(var9), "requirements[" + var9 + "]");
               var8[var9] = new String[var10.size()];
               int var11 = 0;
               if(var11 < var10.size()) {
                  var8[var9][var11] = c.m(var10.get(var11), "requirements[" + var9 + "][" + var11 + "]");
                  ++var11;
                  d.h(new d[3]);
               }

               ++var9;
            }

            if(var8.length == 0) {
               var8 = new String[var6.size()][];
               var9 = 0;
               Iterator var21 = var6.keySet().iterator();
               if(var21.hasNext()) {
                  String var25 = (String)var21.next();
                  var8[var9++] = new String[]{var25};
               }
            }

            int var22 = var8.length;
            int var26 = 0;
            if(var26 < var22) {
               String[] var12 = var8[var26];
               if(var12.length == 0 && var6.isEmpty()) {
                  throw new JsonSyntaxException("Requirement entry cannot be empty");
               }

               int var14 = var12.length;
               int var15 = 0;
               if(var15 < var14) {
                  String var16 = var12[var15];
                  if(!var6.containsKey(var16)) {
                     throw new JsonSyntaxException("Unknown required criterion \'" + var16 + "\'");
                  }

                  ++var15;
               }

               ++var26;
            }

            Iterator var20 = var6.keySet().iterator();
            if(var20.hasNext()) {
               String var23 = (String)var20.next();
               var26 = 0;
               int var13 = var8.length;
               int var30 = 0;
               if(var30 < var13) {
                  String[] var33 = var8[var30];
                  if(ArrayUtils.contains(var33, var23)) {
                     var26 = 1;
                  }

                  ++var30;
               }

               throw new JsonSyntaxException("Criterion \'" + var23 + "\' isn\'t a requirement for completion. This isn\'t supported behaviour, all criteria must be required.");
            } else {
               return new xc.z(var3, var4, var5, var6, var8);
            }
         }
      }

      public static xc.z e(h var0) throws IOException {
         net.yz.m_ var1 = var0.readBoolean()?var0.z():null;
         g4 var2 = var0.readBoolean()?g4.V(var0):null;
         Map var3 = p7.O(var0);
         String[][] var4 = new String[var0.q()][];

         for(int var5 = 0; var5 < var4.length; ++var5) {
            var4[var5] = new String[var0.q()];

            for(int var6 = 0; var6 < var4[var5].length; ++var6) {
               var4[var5][var6] = var0.Z(32767);
            }
         }

         return new xc.z(var1, var2, wn.Z, var3, var4);
      }

      private static Exception a(Exception var0) {
         return var0;
      }
   }
}
