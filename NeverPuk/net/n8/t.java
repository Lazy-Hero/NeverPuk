package net.n8;

import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import net.n0.ks;
import net.n8.l;

public class t {
   public static final t S = new t((net.nj.f)null);
   @Nullable
   private final net.nj.f Z;

   public t(@Nullable net.nj.f var1) {
      this.Z = var1;
   }

   public boolean T(ks var1) {
      return this == S || this.V(var1.o());
   }

   public boolean O(net.ne.l var1) {
      return this == S || this.V(net.nv.h.c(var1));
   }

   public boolean V(@Nullable net.nj.q var1) {
      l.O();
      return this == S;
   }

   public static t u(@Nullable JsonElement var0) {
      String var1 = l.O();
      if(var0 != null && !var0.isJsonNull()) {
         net.nj.f var2 = net.nj.g.c(net.yz.c.m(var0, "nbt"));
         return new t(var2);
      } else {
         return S;
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
