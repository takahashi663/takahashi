@echo off
REM 7-zip���C���X�g�[�����Ă���O��ł�
set ZIP_PATH="C:\Program Files\7-Zip\7z.exe"
REM �I���W�i���̃t�H���_���X�g
set ORI_FOLDER1="src\Question01"
set ORI_FOLDER2="src\Question02"
set ORI_FOLDER3="src\Question03"
set ORI_FOLDER4="src\Question04"
set ORI_FOLDER5="src\Question05"
set ORI_FOLDER6="src\Question06"
set ORI_FOLDER7="src\Question07"
set ORI_FOLDER8="src\Question08"
set ORI_FOLDER9="src\Question09"
set ORI_FOLDER10="src\Question10"
set ORI_FOLDER11="src\Question11"
set ORI_FOLDER12="src\Question12"
set ORI_FOLDER13="src\Question13"
set ORI_FOLDER14="src\Question14"
set ORI_FOLDER15="src\Question15"
set ORI_FOLDER16="src\Question16"
set ORI_FOLDER17="src\Question17"
set ORI_FOLDER18="src\Question18"
set ORI_FOLDER19="src\Question19"
set ORI_FOLDER20="src\Question20"
set ORI_FOLDER21="src\Question21"
set ORI_FOLDER22="src\Question22"
set ORI_FOLDER23="src\Question23"
set ORI_FOLDER24="src\Question24"
set ORI_FOLDER25="src\Question25"
set ORI_FOLDER26="src\Question26"
set ORI_FOLDER27="src\Question27"
set ORI_FOLDER28="src\Question28"

REM �ړ���̃t�H���_���X�g
set FOLDER0="�𓚃\�[�X�R�[�h�i��u���p�j"
set FOLDER1="01_�T�v"
set FOLDER2="02_�W���o��"
set FOLDER3="03_��{�\��"
set FOLDER4="04_���e����"
set FOLDER5="05_�ϐ�"
set FOLDER6="06_���o��"
set FOLDER7="07_���Ɖ��Z�q"
set FOLDER8="08_�z��"
set FOLDER9="09_���򏈗�"
set FOLDER10="10_�J��Ԃ�"
set FOLDER11="11_�N���X�̊�{"
set FOLDER12="12_����"
set FOLDER13="13_�߂�l"
set FOLDER14="14_�A�N�Z�X����"
set FOLDER15="15_�I�[�o�[���[�h"
set FOLDER16="16_�R���X�g���N�^"
set FOLDER17="17_Static�����o"
set FOLDER18="18_�N���X���C�u����"
set FOLDER19="19_�N���X�^�̕ϐ�"
set FOLDER20="20_�p��"
set FOLDER21="21_�I�[�o�[���C�h"
set FOLDER22="22_Object�N���X"
set FOLDER23="23_�C���^�[�t�F�C�X"
set FOLDER24="24_�p�b�P�[�W"
set FOLDER25="25_�C���|�[�g"
set FOLDER26="26_��O"
set FOLDER27="27_�R���N�V�����t���[�����[�N"
set FOLDER28="28_�R�[�f�B���O�K��"

REM �ړ���̃t�H���_�쐬
md ..\%FOLDER0%
md ..\%FOLDER0%\%FOLDER1%
md ..\%FOLDER0%\%FOLDER2%
md ..\%FOLDER0%\%FOLDER3%
md ..\%FOLDER0%\%FOLDER4%
md ..\%FOLDER0%\%FOLDER5%
md ..\%FOLDER0%\%FOLDER6%
md ..\%FOLDER0%\%FOLDER7%
md ..\%FOLDER0%\%FOLDER8%
md ..\%FOLDER0%\%FOLDER9%
md ..\%FOLDER0%\%FOLDER10%
md ..\%FOLDER0%\%FOLDER11%
md ..\%FOLDER0%\%FOLDER12%
md ..\%FOLDER0%\%FOLDER13%
md ..\%FOLDER0%\%FOLDER14%
md ..\%FOLDER0%\%FOLDER15%
md ..\%FOLDER0%\%FOLDER16%
md ..\%FOLDER0%\%FOLDER17%
md ..\%FOLDER0%\%FOLDER18%
md ..\%FOLDER0%\%FOLDER19%
md ..\%FOLDER0%\%FOLDER20%
md ..\%FOLDER0%\%FOLDER21%
md ..\%FOLDER0%\%FOLDER22%
md ..\%FOLDER0%\%FOLDER23%
md ..\%FOLDER0%\%FOLDER24%
md ..\%FOLDER0%\%FOLDER25%
md ..\%FOLDER0%\%FOLDER26%
md ..\%FOLDER0%\%FOLDER27%
md ..\%FOLDER0%\%FOLDER28%

REM �t�H���_��U�蕪����
copy %ORI_FOLDER1% ..\%FOLDER0%\%FOLDER1%
copy %ORI_FOLDER2% ..\%FOLDER0%\%FOLDER2%
copy %ORI_FOLDER3% ..\%FOLDER0%\%FOLDER3%
copy %ORI_FOLDER4% ..\%FOLDER0%\%FOLDER4%
copy %ORI_FOLDER5% ..\%FOLDER0%\%FOLDER5%
copy %ORI_FOLDER6% ..\%FOLDER0%\%FOLDER6%
copy %ORI_FOLDER7% ..\%FOLDER0%\%FOLDER7%
copy %ORI_FOLDER8% ..\%FOLDER0%\%FOLDER8%
copy %ORI_FOLDER9% ..\%FOLDER0%\%FOLDER9%
copy %ORI_FOLDER10% ..\%FOLDER0%\%FOLDER10%
copy %ORI_FOLDER11% ..\%FOLDER0%\%FOLDER11%
copy %ORI_FOLDER12% ..\%FOLDER0%\%FOLDER12%
copy %ORI_FOLDER13% ..\%FOLDER0%\%FOLDER13%
copy %ORI_FOLDER14% ..\%FOLDER0%\%FOLDER14%
copy %ORI_FOLDER15% ..\%FOLDER0%\%FOLDER15%
copy %ORI_FOLDER16% ..\%FOLDER0%\%FOLDER16%
copy %ORI_FOLDER17% ..\%FOLDER0%\%FOLDER17%
copy %ORI_FOLDER18% ..\%FOLDER0%\%FOLDER18%
copy %ORI_FOLDER19% ..\%FOLDER0%\%FOLDER19%
copy %ORI_FOLDER20% ..\%FOLDER0%\%FOLDER20%
copy %ORI_FOLDER21% ..\%FOLDER0%\%FOLDER21%
copy %ORI_FOLDER22% ..\%FOLDER0%\%FOLDER22%
copy %ORI_FOLDER23% ..\%FOLDER0%\%FOLDER23%
xcopy /e /i /h %ORI_FOLDER24% ..\%FOLDER0%\%FOLDER24%
copy %ORI_FOLDER25% ..\%FOLDER0%\%FOLDER25%
copy %ORI_FOLDER26% ..\%FOLDER0%\%FOLDER26%
copy %ORI_FOLDER27% ..\%FOLDER0%\%FOLDER27%
copy %ORI_FOLDER28% ..\%FOLDER0%\%FOLDER28%

REM �t�H���_���Ƃ�zip��
REM 7-zip���C���X�g�[�����Ă���O��ł�
for /d %%f in (..\%FOLDER0%\*) do (
  echo Compressing %%f
  %ZIP_PATH% a -tzip %%f.zip %%f
)

explorer ..\%FOLDER0%

exit /B 0