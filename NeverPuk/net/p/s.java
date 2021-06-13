package net.p;

import com.google.common.collect.Lists;
import java.util.List;
import net.xn;
import net.cb.h;
import net.cb.t;
import net.e.f;
import net.e.k;
import net.p.p;
import net.p.u;
import net.u.d;

public class s implements u {
   private final List C;

   public s() {
      p.Y();
      this.C = Lists.newArrayList();
      this.C.add(new f());
      this.C.add(new k());
      if(d.y() == null) {
         p.I(false);
      }

   }

   public List U() {
      return this.C;
   }

   public t o() {
      return new h("spectatorMenu.root.prompt", new Object[0]);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
