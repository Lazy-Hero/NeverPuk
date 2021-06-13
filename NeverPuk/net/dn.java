package net;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.pg;
import net.zk;
import net.n2.h;

public class dn {
   private static final SimpleDateFormat G = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
   private final pg Q;
   private Date i;

   public dn(pg var1) {
      this.Q = var1;
   }

   public boolean F() {
      return this.i != null;
   }

   public void m() {
      this.i = new Date();
   }

   public void B() {
      this.i = null;
   }

   public Date r() {
      return this.i;
   }

   public String toString() {
      boolean var1 = zk.l.p();
      return "CriterionProgress{obtained=" + (this.i == null?"false":this.i) + '}';
   }

   public void j(h var1) {
      var1.writeBoolean(this.i != null);
      if(this.i != null) {
         var1.M(this.i);
      }

   }

   public JsonElement h() {
      return (JsonElement)(this.i != null?new JsonPrimitive(G.format(this.i)):JsonNull.INSTANCE);
   }

   public static dn e(h var0, pg var1) {
      dn var2 = new dn(var1);
      if(var0.readBoolean()) {
         var2.i = var0.z();
      }

      return var2;
   }

   public static dn y(pg var0, String var1) {
      dn var2 = new dn(var0);
      var2.i = G.parse(var1);
      return var2;
   }

   private static JsonSyntaxException a(JsonSyntaxException var0) {
      return var0;
   }
}
