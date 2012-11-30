package opscode.chef.REST;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Security;
import java.security.spec.RSAPrivateKeySpec;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openssl.PEMReader;

public class RSAUtils {

    public static PrivateKey readKeyFromFileXXX(File keyFile)
            throws IOException {

        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(
                keyFile));
        try {
            BigInteger m = (BigInteger) oin.readObject();
            BigInteger e = (BigInteger) oin.readObject();
            // RSAPublicKeySpec keySpec = new RSAPublicKeySpec(m, e);
            RSAPrivateKeySpec pvtKeySpec = new RSAPrivateKeySpec(m, e);
            KeyFactory fact = KeyFactory.getInstance("RSA");
            // PublicKey pubKey = fact.generatePublic(keySpec);

            return fact.generatePrivate(pvtKeySpec);
        } catch (Exception e) {
            throw new RuntimeException("Spurious serialisation error", e);
        } finally {
            oin.close();
        }
    }

    public static PrivateKey readKeyFromFile(File keyFile) throws IOException {
        BufferedReader br = null ;
        try {
            br = new BufferedReader(new FileReader(keyFile));
            Security.addProvider(new BouncyCastleProvider());

            KeyPair kp = (KeyPair) new PEMReader(br).readObject();
            PrivateKey privateKey = kp.getPrivate();

         //   System.out.println(((RSAKey) privateKey).getModulus());
       //     System.out.println(((RSAPrivateKey) privateKey)
         //           .getPrivateExponent());
            return privateKey;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            br.close();
            
        }
        
        // samlResponse.sign(Signature.getInstance("SHA1withRSA").toString(),
        // kp.getPrivate(), certs)
        return null;

    }

}
