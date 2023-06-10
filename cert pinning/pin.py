from M2Crypto import X509
import sys, binascii, hashlib

def main(argv):
    if len(argv) < 1:
        print("Usage: pin.py <certificate_path>")
        return

    x509        = X509.load_cert(argv[0])
    spki        = x509.get_pubkey()
    encodedSpki = spki.as_der()

    digest = hashlib.sha1()
    digest.update(encodedSpki)

    print("Calculating PIN for certificate: " + x509.get_subject().as_text())
    print("Pin Value: " + binascii.hexlify(digest.digest()))

if __name__ == '__main__':
    main(sys.argv[1:])