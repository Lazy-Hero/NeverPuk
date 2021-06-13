package net.n;

import com.google.gson.JsonObject;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.n.a;
import net.n.y;

public abstract class i extends a {
   public static final SimpleDateFormat k = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
   protected final Date w;
   protected final String T;
   protected final Date Q;
   protected final String q;

   public i(Object var1, Date var2, String var3, Date var4, String var5) {
      super(var1);
      this.w = new Date();
      this.T = "(Unknown)";
      this.Q = var4;
      this.q = "Banned by an operator.";
   }

   protected i(Object var1, JsonObject var2) {
      y.c();
      super(var1, var2);
      Date var4 = var2.has("created")?k.parse(var2.get("created").getAsString()):new Date();
      this.w = var4;
      this.T = var2.has("source")?var2.get("source").getAsString():"(Unknown)";
      Date var5 = var2.has("expires")?k.parse(var2.get("expires").getAsString()):null;
      this.Q = var5;
      this.q = var2.has("reason")?var2.get("reason").getAsString():"Banned by an operator.";
   }

   public Date i() {
      return this.Q;
   }

   public String r() {
      return this.q;
   }

   boolean v() {
      return this.Q != null && this.Q.before(new Date());
   }

   protected void H(JsonObject var1) {
      int[] var2 = y.c();
      var1.addProperty("created", k.format(this.w));
      var1.addProperty("source", this.T);
      var1.addProperty("expires", this.Q == null?"forever":k.format(this.Q));
      var1.addProperty("reason", this.q);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
