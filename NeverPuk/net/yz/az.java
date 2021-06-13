package net.yz;

import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class az {
   private static final Logger W = LogManager.getLogger();

   public static SecretKey g() {
      KeyGenerator var0 = KeyGenerator.getInstance("AES");
      var0.init(128);
      return var0.generateKey();
   }

   public static KeyPair p() {
      KeyPairGenerator var0 = KeyPairGenerator.getInstance("RSA");
      var0.initialize(1024);
      return var0.generateKeyPair();
   }

   public static byte[] G(String var0, PublicKey var1, SecretKey var2) {
      return z("SHA-1", new byte[][]{var0.getBytes("ISO_8859_1"), var2.getEncoded(), var1.getEncoded()});
   }

   private static byte[] z(String var0, byte[]... var1) {
      int var2 = m_.J();
      MessageDigest var3 = MessageDigest.getInstance(var0);
      int var5 = var1.length;
      int var6 = 0;
      if(var6 < var5) {
         byte[] var7 = var1[var6];
         var3.update(var7);
         ++var6;
      }

      return var3.digest();
   }

   public static PublicKey T(byte[] var0) {
      X509EncodedKeySpec var1 = new X509EncodedKeySpec(var0);
      KeyFactory var2 = KeyFactory.getInstance("RSA");
      return var2.generatePublic(var1);
   }

   public static SecretKey g(PrivateKey var0, byte[] var1) {
      return new SecretKeySpec(I(var0, var1), "AES");
   }

   public static byte[] D(Key var0, byte[] var1) {
      return X(1, var0, var1);
   }

   public static byte[] I(Key var0, byte[] var1) {
      return X(2, var0, var1);
   }

   private static byte[] X(int var0, Key var1, byte[] var2) {
      return l(var0, var1.getAlgorithm(), var1).doFinal(var2);
   }

   private static Cipher l(int var0, String var1, Key var2) {
      Cipher var3 = Cipher.getInstance(var1);
      var3.init(var0, var2);
      return var3;
   }

   public static Cipher i(int var0, Key var1) {
      Cipher var2 = Cipher.getInstance("AES/CFB8/NoPadding");
      var2.init(var0, var1, new IvParameterSpec(var1.getEncoded()));
      return var2;
   }

   private static NoSuchAlgorithmException a(NoSuchAlgorithmException var0) {
      return var0;
   }
}
