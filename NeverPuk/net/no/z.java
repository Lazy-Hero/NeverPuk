package net.no;

import java.io.IOException;
import javax.annotation.Nullable;
import net.xn;
import net.no.s8;

public class z implements net.n2.k {
   private int i;
   private int a;

   public z() {
   }

   public z(net.ne.l var1, @Nullable net.ne.l var2) {
      s8.Y();
      super();
      this.i = var1.G();
      this.a = var2 != null?var2.G():-1;
   }

   public void E(net.n2.h var1) throws IOException {
      this.i = var1.readInt();
      this.a = var1.readInt();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeInt(this.i);
      var1.writeInt(this.a);
   }

   public void S(net.x.t var1) {
      var1.Q(this);
   }

   public int a() {
      return this.i;
   }

   public int h() {
      return this.a;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
