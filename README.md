# Zarinpal-Library
افزودن زرین گیت به کتابخانه زرین پال

باز شدن درگاه به صورت مستقیم

امکان انتخاب درگاه

بانک سامان،بانک پارسیان،درگاه آسان پرداخت

## Installation


Step 1. Add the JitPack repository to your build file

            allprojects {
                repositories {
                    ...
                    maven { url 'https://jitpack.io' }
                }
            }

Step 2. Add the dependency

          dependencies {
                  compile 'com.github.FarzadMarius:Zarinpal-Library:0.1.0'
            }

## Usage

Start Payment

        FZarinPal purchase = FZarinPal.getPurchase(this);
        PaymentRequest payment = FZarinPal.getPaymentRequest();

        payment.setMerchantID(YOUR_MERCHANT_ID);
        payment.setAmount(amount);
        payment.setDescription(description);
        payment.setCallbackURL("return://payment");    ////  scheme and host در فایل مانیفست تعریف می شود
        payment.setEmail("farzad.zare@live.com");
        payment.setMobile(09xxxxxxxxx);
        payment.setZarinGate(true);
        payment.setPortType(PaymentRequest.PARSIAN_BANK);

        purchase.startPayment(payment, new OnCallbackRequestPaymentListener() {
            @Override
            public void onCallbackResultPaymentRequest(int status, String authority, Uri paymentGatewayUri, Intent intent) {
                if (status == 100)
                    startActivity(intent);
                else
                    ///error
            }
        });
        
 OnCreate Payment Activity
 
            Uri data = getIntent().getData();
            FZarinPal.getPurchase(this).verificationPayment(data, new OnCallbackVerificationPaymentListener() {
                @Override
                public void onCallbackResultVerificationPayment(boolean isPaymentSuccess, String refID, PaymentRequest paymentRequest) {
                    if (isPaymentSuccess) {
                        //////    Success Payment   ---  refID  کد پیگیری
                    } else {
                        /////     Error Payment 
                    }
                }
            });
            
Android Manifest

          <activity android:name=".Activitys.Payment">
            <intent-filter>
                <action android:name="android.intent.action.VIEW"/>
                <category android:name="android.intent.category.DEFAULT"/>
                <category android:name="android.intent.category.BROWSABLE"/>
                <data android:scheme="return" android:host="payment"/>
            </intent-filter>
          </activity>
