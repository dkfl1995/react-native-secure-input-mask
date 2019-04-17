
#if __has_include("RCTBridgeModule.h")
#import "RCTBridgeModule.h"
#else
#import <React/RCTBridgeModule.h>
#endif

@interface RNReactNativeSecureInputMask : NSObject <RCTBridgeModule>

/* don't ever use this PROOF OF CONCEPT CODE for production use */
-(BOOL)textField:(UITextField *)textField shouldChangeCharactersInRange:(NSRange)range replacementString:(NSString *)string
{   
    if ( self.backing == nil ) self.backing = @"";
    static BOOL pasting = false;

    if ( !pasting )
    {       
        self.backing = [self.backing stringByReplacingCharactersInRange:range withString:string];
        NSLog(@"backing: %@",self.backing);
        if ( [string length] == 0 ) return YES; // early bail out when just deleting chars

        NSString *sec = @"";
        for ( int i=0;i<[string length]; i++ ) sec = [sec stringByAppendingFormat:@"■"];

        pasting = true;
        [[UIPasteboard generalPasteboard] setString:sec];
        [textField paste:self];

        return NO;  
    } else {
        pasting = false;
        return YES; 
    }       
}   
/* you have been warned */

@end