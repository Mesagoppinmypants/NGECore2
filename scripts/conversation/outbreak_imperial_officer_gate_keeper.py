from resources.common import ConversationOption
from engine.resources.scene import Point3D
from resources.common import ProsePackage
from resources.datatables import Options
from resources.common import OutOfBand
from java.util import Vector
import sys

def startConversation(core, actor, npc):
		convSvc = core.conversationService
	
		# The quarantine zone is a restricted area, citizen.
		convSvc.sendConversationMessage(actor, npc, OutOfBand.ProsePackage('@conversation/gate_keeper_quarantine_zone:s_10'))
		options = Vector()
		# I have authorization to enter.
		options.add(ConversationOption(OutOfBand.ProsePackage('@conversation/gate_keeper_quarantine_zone:s_12'), 0))
		convSvc.sendConversationOptions(actor, npc, handleOptionsOne)
		return
	
def handleOptionsOne(core, actor, npc, selection):
		convSvc = core.conversationService
	
		if selection == 0: 
				# What? Let me see your authorization code.
				convSvc.sendConversationMessage(actor, npc, OutOfBand.ProsePackage('@conversation/gate_keeper_quarantine_zone:s_14'))
				options = Vector()
				# Here...
				options.add(ConversationOption(OutOfBand.ProsePackage('@conversation/gate_keeper_quarantine_zone:s_16'), 1)
				convSvc.sendConversationOptions(actor, npc, options, handleOptionsTwo)
		return
		
def handleOptionsTwo(core, actor, npc, selection):
		convSvc = core.conversationService
	
		if selection == 1: 
				# Well, I see. Everything checks out. I can't say that I envy you, but I certainly appreciate what you are doing for the Empire...whatever you are doing.
				convSvc.sendConversationMessage(actor, npc, OutOfBand.ProsePackage('@conversation/gate_keeper_quarantine_zone:s_19'))
				
				# *Teleports player to inside the gate*
				#position = Point3D(-5789, 511, -6558)
				#core.simulationService.transferToPlanet(actor, core.terrainService.getPlanetByName("dathomir"), position, actor.getOrientation(), None)
				convSvc.sendConversationOptions(actor, npc, options, endConversation)
		return
		
def endConversation(core, actor, npc):
		convSvc = core.conversationService
	
		# Go with the blessing, then.
		convSvc.sendConversationMessage(actor, npc, OutOfBand.ProsePackage('@conversation/azure_cabal_hoolar:s_195'))
		return
		
