package net.yl;

import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import net.xn;
import net.n.y;
import net.nj.f;
import net.r.h;
import net.yl.j;

public class z extends y {
   private f R;

   public z(j var1) {
      super(var1);
      this.Z(10);
   }

   protected void I(h var1) {
      int[] var2 = j.d();
      if(var1.Q().equals(this.p().Z())) {
         this.R = var1.G(new f());
      }

      super.I(var1);
   }

   public String a(SocketAddress var1, GameProfile var2) {
      int[] var3 = j.d();
      return var2.getName().equalsIgnoreCase(this.p().Z()) && this.F(var2.getName()) != null?"That name is already taken.":super.a(var1, var2);
   }

   public j p() {
      return (j)super.S();
   }

   public f w() {
      return this.R;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
