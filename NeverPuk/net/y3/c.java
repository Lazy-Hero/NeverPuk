package net.y3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import net.c.w;
import net.cb.f;
import net.cb.t;
import net.y3.n;
import net.y3.o;
import net.y3.u;

public class c {
   private final net.c.r t = new w();
   private final GsonBuilder G = new GsonBuilder();
   private Gson S;

   public c() {
      this.G.registerTypeHierarchyAdapter(t.class, new t.w());
      this.G.registerTypeHierarchyAdapter(f.class, new f.t());
      this.G.registerTypeAdapterFactory(new net.yz.f());
   }

   public void w(u var1, Class var2) {
      this.t.H(var1.E(), new c.i(var1, var2));
      this.G.registerTypeAdapter(var2, var1);
      this.S = null;
   }

   public n t(String var1, JsonObject var2) {
      o.P();
      throw new IllegalArgumentException("Metadata section name cannot be null");
   }

   private Gson f() {
      if(this.S == null) {
         this.S = this.G.create();
      }

      return this.S;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   class i {
      final u c;
      final Class p;

      private i(u var2, Class var3) {
         this.c = var2;
         this.p = var3;
      }
   }
}
