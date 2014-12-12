package Repliers

import java.awt.image.BufferedImage
import javax.mail.Address

import PhotoMoney.Wallet

trait Replier {
    def validateCredentials(): Boolean

    def sendMail(to: Address, wallet: Wallet, text: String, image: Option[BufferedImage]=None)
}
