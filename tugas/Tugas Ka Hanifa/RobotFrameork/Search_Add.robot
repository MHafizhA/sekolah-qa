*** Settings ***
Library    Selenium2Library
Library    OperatingSystem
Suite Setup  Setup chromedriver

*** Keywords ****
Setup chromedriver
# Run configure for robotframework
  Set Environment Variable  webdriver.chrome.driver  ${EXECDIR} C:\Users\AL - HAFIZH\PycharmProjects\pythonRobot\chromedriver.exe

*** Variables ***
# Browser
${Url}                   http://automationpractice.com/index.php
${browser}               chrome

# test case Search Product t-shirt
${clmSearch}             id=search_query_top
${btnSearch}             name=submit_search
# Assertion search product
${getValueSProductText}  class=product-count

####################################

# test case Add Cart Product t-shirt
${btnAddCart}            xpath=//*[@id="homefeatured"]/li[1]/div/div[2]/div[2]/a[1]
${btnProceedCart}        xpath=//*[@id="layer_cart"]/div[1]/div[2]/div[4]/a
# Assertion Add Cart
${getValueAddCartItem}   class=cart_product
${getValueAddCartPage}   class=icon-ok
${getValueAddCartText}   Product successfully added to your shopping cart

*** Test Cases ***
TC_SearchProduct
    [Documentation]    this test case to search product
    Open browser    ${Url}    ${browser}
    wait until page contains    My Store
    input_text    ${clmSearch}    t-shirt
    sleep    3
    click_element    ${btnSearch}
    sleep    3
    Page Should Contain Element    ${getValueSProductText}
    sleep    3
    Close Browser

*** Test Cases ***
TC_addProductToCart
    [Documentation]    this test case to add product to cart
    Open browser    ${Url}    ${browser}
    wait until page contains    My Store
    Sleep    3
    click_element    ${btnAddCart}
    Sleep    3
    Page Should Contain   ${getValueAddCartText}
    Sleep    3
    click_element       ${btnProceedCart}
    Sleep    3
    Page Should Contain Element    ${getValueAddCartItem}
    sleep    3
    Close Browser

