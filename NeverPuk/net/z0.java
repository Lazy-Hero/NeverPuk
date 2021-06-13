package net;

import com.sun.jna.Native;
import com.sun.jna.k;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.pm;
import net.pw;

public interface z0 extends k {
   z0 X = (z0)Native.f("discord-rpc", z0.class);
   int W = 0;
   int F = 1;
   int N = 2;

   void I(@Nonnull String var1, @Nullable pw var2, boolean var3, @Nullable String var4);

   void U();

   void O();

   void t();

   void d(@Nullable pm var1);

   void l();

   void Q(@Nonnull String var1, int var2);

   void Y(@Nullable pw var1);

   void K(String var1, String var2);

   void D(String var1, String var2);
}
