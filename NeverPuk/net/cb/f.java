package net.cb;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import net.xn;
import net.cb.k;
import net.cb.t;

public class f {
   private f K;
   private net.cb.z C;
   private Boolean M;
   private Boolean s;
   private Boolean i;
   private Boolean o;
   private Boolean R;
   private net.n6.k t;
   private net.n6.o p;
   private String P;
   private static final f v = new f() {
      @Nullable
      public net.cb.z o() {
         return null;
      }

      public boolean U() {
         return false;
      }

      public boolean r() {
         return false;
      }

      public boolean l() {
         return false;
      }

      public boolean Z() {
         return false;
      }

      public boolean C() {
         return false;
      }

      @Nullable
      public net.n6.k T() {
         return null;
      }

      @Nullable
      public net.n6.o W() {
         return null;
      }

      @Nullable
      public String k() {
         return null;
      }

      public f i(net.cb.z var1) {
         throw new UnsupportedOperationException();
      }

      public f f(Boolean var1) {
         throw new UnsupportedOperationException();
      }

      public f P(Boolean var1) {
         throw new UnsupportedOperationException();
      }

      public f Q(Boolean var1) {
         throw new UnsupportedOperationException();
      }

      public f o(Boolean var1) {
         throw new UnsupportedOperationException();
      }

      public f M(Boolean var1) {
         throw new UnsupportedOperationException();
      }

      public f V(net.n6.k var1) {
         throw new UnsupportedOperationException();
      }

      public f G(net.n6.o var1) {
         throw new UnsupportedOperationException();
      }

      public f S(f var1) {
         throw new UnsupportedOperationException();
      }

      public String toString() {
         return "Style.ROOT";
      }

      public f A() {
         return this;
      }

      public f L() {
         return this;
      }

      public String V() {
         return "";
      }
   };

   @Nullable
   public net.cb.z o() {
      return this.C == null?this.a().o():this.C;
   }

   public boolean U() {
      return this.M == null?this.a().U():this.M.booleanValue();
   }

   public boolean r() {
      return this.s == null?this.a().r():this.s.booleanValue();
   }

   public boolean l() {
      return this.o == null?this.a().l():this.o.booleanValue();
   }

   public boolean Z() {
      return this.i == null?this.a().Z():this.i.booleanValue();
   }

   public boolean C() {
      return this.R == null?this.a().C():this.R.booleanValue();
   }

   public boolean P() {
      return this.M == null && this.s == null && this.o == null && this.i == null && this.R == null && this.C == null && this.t == null && this.p == null && this.P == null;
   }

   @Nullable
   public net.n6.k T() {
      return this.t == null?this.a().T():this.t;
   }

   @Nullable
   public net.n6.o W() {
      return this.p == null?this.a().W():this.p;
   }

   @Nullable
   public String k() {
      return this.P == null?this.a().k():this.P;
   }

   public f i(net.cb.z var1) {
      this.C = var1;
      return this;
   }

   public f f(Boolean var1) {
      this.M = var1;
      return this;
   }

   public f P(Boolean var1) {
      this.s = var1;
      return this;
   }

   public f Q(Boolean var1) {
      this.o = var1;
      return this;
   }

   public f o(Boolean var1) {
      this.i = var1;
      return this;
   }

   public f M(Boolean var1) {
      this.R = var1;
      return this;
   }

   public f V(net.n6.k var1) {
      this.t = var1;
      return this;
   }

   public f G(net.n6.o var1) {
      this.p = var1;
      return this;
   }

   public f H(String var1) {
      this.P = var1;
      return this;
   }

   public f S(f var1) {
      this.K = var1;
      return this;
   }

   public String V() {
      if(this.P()) {
         return this.K != null?this.K.V():"";
      } else {
         StringBuilder var1 = new StringBuilder();
         if(this.o() != null) {
            var1.append(this.o());
         }

         if(this.U()) {
            var1.append(net.cb.z.BOLD);
         }

         if(this.r()) {
            var1.append(net.cb.z.ITALIC);
         }

         if(this.Z()) {
            var1.append(net.cb.z.UNDERLINE);
         }

         if(this.C()) {
            var1.append(net.cb.z.OBFUSCATED);
         }

         if(this.l()) {
            var1.append(net.cb.z.STRIKETHROUGH);
         }

         return var1.toString();
      }
   }

   private f a() {
      return this.K == null?v:this.K;
   }

   public String toString() {
      return "Style{hasParent=" + (this.K != null) + ", color=" + this.C + ", bold=" + this.M + ", italic=" + this.s + ", underlined=" + this.i + ", obfuscated=" + this.R + ", clickEvent=" + this.T() + ", hoverEvent=" + this.W() + ", insertion=" + this.k() + '}';
   }

   public boolean equals(Object var1) {
      String[] var2 = k.B();
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof f)) {
         return false;
      } else {
         f var4 = (f)var1;
         if(this.U() == var4.U() && this.o() == var4.o() && this.r() == var4.r() && this.C() == var4.C() && this.l() == var4.l() && this.Z() == var4.Z()) {
            if((this.T() == null || !this.T().equals(var4.T())) && var4.T() != null) {
               ;
            }

            if((this.W() == null || !this.W().equals(var4.W())) && var4.W() != null) {
               ;
            }

            if((this.k() == null || this.k().equals(var4.k())) && var4.k() == null) {
               ;
            }
         }

         boolean var3 = false;
         return var3;
      }
   }

   public int hashCode() {
      int var1 = this.C.hashCode();
      var1 = 31 * var1 + this.M.hashCode();
      var1 = 31 * var1 + this.s.hashCode();
      var1 = 31 * var1 + this.i.hashCode();
      var1 = 31 * var1 + this.o.hashCode();
      var1 = 31 * var1 + this.R.hashCode();
      var1 = 31 * var1 + this.t.hashCode();
      var1 = 31 * var1 + this.p.hashCode();
      var1 = 31 * var1 + this.P.hashCode();
      return var1;
   }

   public f A() {
      f var1 = new f();
      var1.M = this.M;
      var1.s = this.s;
      var1.o = this.o;
      var1.i = this.i;
      var1.R = this.R;
      var1.C = this.C;
      var1.t = this.t;
      var1.p = this.p;
      var1.K = this.K;
      var1.P = this.P;
      return var1;
   }

   public f L() {
      f var1 = new f();
      var1.f(Boolean.valueOf(this.U()));
      var1.P(Boolean.valueOf(this.r()));
      var1.Q(Boolean.valueOf(this.l()));
      var1.o(Boolean.valueOf(this.Z()));
      var1.M(Boolean.valueOf(this.C()));
      var1.i(this.o());
      var1.V(this.T());
      var1.G(this.W());
      var1.H(this.k());
      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class t implements JsonDeserializer, JsonSerializer {
      @Nullable
      public f F(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         String[] var4 = k.B();
         if(var1.isJsonObject()) {
            f var5 = new f();
            JsonObject var6 = var1.getAsJsonObject();
            if(var6 == null) {
               return null;
            } else {
               if(var6.has("bold")) {
                  var5.M = Boolean.valueOf(var6.get("bold").getAsBoolean());
               }

               if(var6.has("italic")) {
                  var5.s = Boolean.valueOf(var6.get("italic").getAsBoolean());
               }

               if(var6.has("underlined")) {
                  var5.i = Boolean.valueOf(var6.get("underlined").getAsBoolean());
               }

               if(var6.has("strikethrough")) {
                  var5.o = Boolean.valueOf(var6.get("strikethrough").getAsBoolean());
               }

               if(var6.has("obfuscated")) {
                  var5.R = Boolean.valueOf(var6.get("obfuscated").getAsBoolean());
               }

               if(var6.has("color")) {
                  var5.C = (net.cb.z)var3.deserialize(var6.get("color"), net.cb.z.class);
               }

               if(var6.has("insertion")) {
                  var5.P = var6.get("insertion").getAsString();
               }

               if(var6.has("clickEvent")) {
                  JsonObject var7 = var6.getAsJsonObject("clickEvent");
                  if(var7 != null) {
                     JsonPrimitive var8 = var7.getAsJsonPrimitive("action");
                     net.n6.k var9 = var8 == null?null:net.n6.k.Y(var8.getAsString());
                     JsonPrimitive var10 = var7.getAsJsonPrimitive("value");
                     String var11 = var10 == null?null:var10.getAsString();
                     if(var9.O()) {
                        var5.t = new net.n6.k(var9, var11);
                     }
                  }
               }

               if(var6.has("hoverEvent")) {
                  JsonObject var12 = var6.getAsJsonObject("hoverEvent");
                  if(var12 != null) {
                     JsonPrimitive var13 = var12.getAsJsonPrimitive("action");
                     net.n6.o var14 = var13 == null?null:net.n6.o.x(var13.getAsString());
                     t var15 = (t)var3.deserialize(var12.get("value"), t.class);
                     if(var14.m()) {
                        var5.p = new net.n6.o(var14, var15);
                     }
                  }
               }

               return var5;
            }
         } else {
            return null;
         }
      }

      @Nullable
      public JsonElement Z(f var1, Type var2, JsonSerializationContext var3) {
         if(var1.P()) {
            return null;
         } else {
            JsonObject var4 = new JsonObject();
            if(var1.M != null) {
               var4.addProperty("bold", var1.M);
            }

            if(var1.s != null) {
               var4.addProperty("italic", var1.s);
            }

            if(var1.i != null) {
               var4.addProperty("underlined", var1.i);
            }

            if(var1.o != null) {
               var4.addProperty("strikethrough", var1.o);
            }

            if(var1.R != null) {
               var4.addProperty("obfuscated", var1.R);
            }

            if(var1.C != null) {
               var4.add("color", var3.serialize(var1.C));
            }

            if(var1.P != null) {
               var4.add("insertion", var3.serialize(var1.P));
            }

            if(var1.t != null) {
               JsonObject var5 = new JsonObject();
               var5.addProperty("action", var1.t.J().t());
               var5.addProperty("value", var1.t.q());
               var4.add("clickEvent", var5);
            }

            if(var1.p != null) {
               JsonObject var6 = new JsonObject();
               var6.addProperty("action", var1.p.z().x());
               var6.add("value", var3.serialize(var1.p.g()));
               var4.add("hoverEvent", var6);
            }

            return var4;
         }
      }

      private static JsonParseException a(JsonParseException var0) {
         return var0;
      }
   }
}
