package net.j;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import net.cb.f;
import net.cb.t;
import net.j.u;
import net.n2.h;
import net.n2.k;
import net.n2.s;
import net.nh.p;
import net.u.d;
import net.yz.c;

public class b implements k {
   private static final Gson Q = (new GsonBuilder()).registerTypeAdapter(s.l.class, new s.l.u()).registerTypeAdapter(s.a.class, new s.a.c()).registerTypeAdapter(s.class, new s.f()).registerTypeHierarchyAdapter(t.class, new t.w()).registerTypeHierarchyAdapter(f.class, new f.t()).registerTypeAdapterFactory(new net.yz.f()).create();
   private s C;

   public b() {
   }

   public b(s var1) {
      this.C = var1;
   }

   public void E(h var1) throws IOException {
      u.G();
      this.C = (s)c.b(Q, var1.Z(32767), s.class);
      d.h(new d[1]);
   }

   public void O(h var1) throws IOException {
      u.G();
      var1.R(Q.toJson(this.C));
      if(d.y() == null) {
         u.u("hkbikc");
      }

   }

   public void L(p var1) {
      var1.Q(this);
   }

   public s o() {
      return this.C;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
