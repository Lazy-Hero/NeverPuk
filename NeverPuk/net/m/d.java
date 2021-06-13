package net.m;

import java.io.IOException;
import javax.annotation.Nullable;
import net.m.qo;
import org.apache.commons.lang3.StringUtils;

public class d implements net.n2.k {
   private String I;
   private boolean D;
   @Nullable
   private net.u.j b;

   public d() {
   }

   public d(String var1, @Nullable net.u.j var2, boolean var3) {
      this.I = var1;
      this.b = var2;
      this.D = var3;
   }

   public void E(net.n2.h var1) throws IOException {
      this.I = var1.Z(32767);
      this.D = var1.readBoolean();
      boolean var2 = var1.readBoolean();
      this.b = var1.S();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.R(StringUtils.substring(this.I, 0, 32767));
      qo.y();
      var1.writeBoolean(this.D);
      boolean var3 = this.b != null;
      var1.writeBoolean(var3);
      var1.B(this.b);
   }

   public void Y(net.x.x var1) {
      var1.G(this);
   }

   public String S() {
      return this.I;
   }

   @Nullable
   public net.u.j v() {
      return this.b;
   }

   public boolean Y() {
      return this.D;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
